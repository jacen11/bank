package com.company.Bank.Solvers;

import com.company.Customer.Payable;

import java.math.BigDecimal;

public class TransactionSolver implements Solver {
    private final Payable source;
    private final Payable destination;
    private final BigDecimal cash;
    private TransactionStatus status;

    public TransactionSolver(final Payable source, final Payable destination, final BigDecimal cash) {
        this.source = source;
        this.destination = destination;
        this.cash = cash;
    }

    @Override
    public void run() {
        if (source.giveCash(cash)) {
            status = new TransactionStatus(100);
            destination.takeCash(cash);
            source.addHistory(cash, destination, false, status);
            destination.addHistory(cash, source, true, status);
        } else {
            status = new TransactionStatus(200, "Something wrong");
            source.addHistory(cash, destination, false, status);
            destination.addHistory(cash, source, true, status);
        }
    }
}
