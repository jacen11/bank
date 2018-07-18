package com.company.bank.data_access;

import com.company.bank.solver.TransactionStatus;
import com.company.customer.Payable;

import java.math.BigDecimal;

public class HistoryManager implements HistoryDAO {
    @Override
    public void addRecord(Payable source, Payable destination, BigDecimal cash, TransactionStatus status) {

    }

    @Override
    public void getCustomerHistory(Payable source) {

    }

    @Override
    public void deleteCustomerHistory(Payable source) {

    }
}
