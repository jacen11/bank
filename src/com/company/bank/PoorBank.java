package com.company.bank;

import com.company.bank.solver.TransactionSolver;
import com.company.bank.solver.TransactionStatus;
import com.company.customer.Payable;
import java.math.BigDecimal;

public class PoorBank implements Payable{
    public static final String bankName = "PoorBank";
    private static PoorBank instance = null;
    private PoorBank() {}

    public static PoorBank getInstance() {
        if (instance == null) {
            instance = new PoorBank();
        }
        return instance;
    }

    public static void solveTask(Payable source, Payable destination, BigDecimal cash) {
        TransactionSolver solver = new TransactionSolver(source, destination, cash);
        Thread solverThread = new Thread(solver);
        solverThread.run();
    }

    @Override
    public String getUniqueId() {
        return bankName;
    }

    @Override
    public boolean hasCash(final BigDecimal cash) {
        return true;
    }

    @Override
    public boolean giveCash(final BigDecimal cash) {
        return false;
    }

    @Override
    public void takeCash(final BigDecimal cash) {
    // TODO
    }

    @Override
    public void addHistory(final BigDecimal cash, final Payable payable, final boolean income, final TransactionStatus status) {
    // TODO
    }
}
