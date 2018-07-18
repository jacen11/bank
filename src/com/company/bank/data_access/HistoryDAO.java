package com.company.bank.data_access;

import com.company.bank.solver.TransactionStatus;
import com.company.customer.Payable;

import java.math.BigDecimal;

public interface HistoryDAO {
    public void addRecord(Payable source, Payable destination, BigDecimal cash, TransactionStatus status);
    public void getCustomerHistory(Payable source); //json, xml
    public void deleteCustomerHistory(Payable source);
}
