package com.company.Bank;

import com.company.Bank.Solvers.TransactionSolver;
import com.company.Bank.Solvers.TransactionStatus;
import com.company.Customer.Customer;
import com.company.Customer.Payable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoorBank {
    private final Map<String,Customer> clients;
    private final List<TransactionSolver> solvers = new ArrayList<>();

    public PoorBank(final Map<String, Customer> clients) {
        this.clients = new HashMap<>(clients);
    }

    public void createTask(Payable source, Payable destination, BigDecimal cash) {
        TransactionSolver solver = new TransactionSolver(source, destination, cash);
        solvers.add(solver);
        Thread solverThread = new Thread(solver);
        solverThread.run();
    }

    public Map<String, Customer> getClients() {
        return new HashMap<>(clients);
    }

    public List<TransactionSolver> getSolvers() {
        return new ArrayList<>(solvers);
    }
}
