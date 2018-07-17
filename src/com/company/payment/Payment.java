package com.company.payment;

import com.company.bank.solver.TransactionStatus;
import com.company.customer.Payable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {

    private final BigDecimal cash;
    private final LocalDateTime localDateTime;
    private final Payable payable;
    private final boolean income;
    private final TransactionStatus status;

    public Payment(final BigDecimal cash, final LocalDateTime localDateTime, final Payable payable, final boolean
            income, TransactionStatus status) {
        this.cash = cash;
        this.localDateTime = localDateTime;
        this.payable = payable;
        this.income = income;
        this.status = status;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public boolean isIncome() {
        return income;
    }

    public Payable getPayable() {

        return payable;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public TransactionStatus getStatus() {
        return status;
    }
}
