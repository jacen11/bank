package com.company.bank.solver;

import com.company.customer.Payable;

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
            destination.takeCash(cash);
            source.addHistory(cash, destination, false, TransactionStatus.OK);
            destination.addHistory(cash, source, true, TransactionStatus.OK);
        } else {
            source.addHistory(cash, destination, false, TransactionStatus.ERROR);
            destination.addHistory(cash, source, true, TransactionStatus.ERROR);
        }
    }
}
