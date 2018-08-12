package com.company.bank.tasks.transaction;

import com.company.bank.Payable;
import com.company.bank.customer.payment.Payment;
import com.company.bank.tasks.Task;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionTask implements Task {
    private final Payable source;
    private final Payable destination;
    private final BigDecimal cash;
    private TransactionStatus status;

    public TransactionTask(final Payable source, final Payable destination, final BigDecimal cash) {
        this.source = source;
        this.destination = destination;
        this.cash = cash;
    }

    @Override
    public void run() {
        if (source.takeCash(cash)) {
            destination.giveCash(cash);
            addHistories(TransactionStatus.OK);
        } else {
            addHistories(TransactionStatus.ERROR);
        }
    }

    private void addHistories(TransactionStatus status) {
        Payment sourcePayment = new Payment(cash, LocalDateTime.now(), destination, status);
        Payment destinationPayment = new Payment(cash.negate(), LocalDateTime.now(), source, status);
        source.addHistory(sourcePayment);
        destination.addHistory(destinationPayment);
    }
}
