package com.company.bank.customer.common;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import com.company.bank.Payable;
import com.company.bank.customer.payment.Payment;

public abstract class Customer implements Payable {
    private final String login;
    private String password;
    private AtomicReference<BigDecimal> cashReference = new AtomicReference<>();
    private List<Payment> payments = new ArrayList<>();

    Customer(final String login, final String password) {
        this.login = login;
        this.password = password;
    }

    public ArrayList<Payment> getPayments() {
        return new ArrayList<>(payments);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getCash() {
        return cashReference.get();
    }

    @Override
    public void giveCash(final BigDecimal amount) {
        BigDecimal currentCash;
        while (true) {
            currentCash = cashReference.get();
            if (cashReference.compareAndSet(currentCash, amount)) {
                break;
            }
        }
    }

    @Override
    public boolean takeCash(final BigDecimal amount) {
        while (true) {
            BigDecimal currentCash = cashReference.get();
            if (currentCash.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
                if (cashReference.compareAndSet(currentCash, currentCash.subtract(amount))) {
                    return true;
                }
            } else {
                return false;
            }
        }

    }

    @Override
    public void addHistory(final Payment payment) {
        payments.add(payment);
    }

    public String toString() {
        return getUniqueId();
    }
}
