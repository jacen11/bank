package com.company.customer;

import com.company.bank.solver.TransactionStatus;
import com.company.payment.Payment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PersonalCustomer extends Customer {
    private final String passportId;
    private List<Payment> payments = new ArrayList<>();

    public PersonalCustomer(final String login, final String password, final BigDecimal cash, final String passportId) {
        super(login, password, cash);
        this.passportId = passportId;
    }

    public ArrayList<Payment> getPayments() {
        return new ArrayList<>(payments);
    }

    public void addPayment(BigDecimal cash, LocalDateTime localDateTime, Payable payable, boolean income,
                           TransactionStatus status) {
        Payment payment = new Payment(cash, localDateTime, payable, income, status);
        this.payments.add(payment);
    }
    public String getPassportId() {
        return passportId;

    }

    @Override
    public String getUniqueId() {
        return super.getLogin();
    }

    @Override
    public boolean hasCash(final BigDecimal cash) {
        return super.getCash().compareTo(cash) != -1;
    }

    @Override
    public synchronized boolean giveCash(final BigDecimal cash) {
        BigDecimal tempCash = getCash();
        tempCash = getCash().subtract(cash);
        if (tempCash.compareTo(BigDecimal.ZERO) != -1) {
                setCash(tempCash);
                return true;
        } else {
            return false;
        }
    }

    @Override
    public synchronized void takeCash(final BigDecimal cash) {
        this.setCash(getCash().add(cash));
    }

    @Override
    public void addHistory(final BigDecimal cash, final Payable payable, final boolean income, final
                           TransactionStatus status) {
        addPayment(cash, LocalDateTime.now(),payable,income, status);
    }
}

