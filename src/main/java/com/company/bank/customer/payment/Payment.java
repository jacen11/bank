package com.company.bank.customer.payment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.company.bank.Payable;
import com.company.bank.tasks.transaction.TransactionStatus;

public class Payment {
    private final BigDecimal cashChange;
    private final LocalDateTime localDateTime;
    private final Payable payable;
    private final TransactionStatus status;

    public Payment(final BigDecimal cashChange, final LocalDateTime localDateTime, final Payable payable, TransactionStatus status) {
        this.cashChange = cashChange;
        this.localDateTime = localDateTime;
        this.payable = payable;
        this.status = status;
    }

    public BigDecimal getCashChange() {
        return cashChange;
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Customer: ");
        stringBuilder.append(", Cash change: ");
        stringBuilder.append(", ");
        stringBuilder.append(LocalDateTime.now().toString());
        stringBuilder.append(", Status: ");
        stringBuilder.append(status.name());
        return stringBuilder.toString();
    }
}