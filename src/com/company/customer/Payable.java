package com.company.customer;

import com.company.bank.solver.TransactionStatus;

import java.math.BigDecimal;

public interface Payable {
    String getUniqueId();

    boolean hasCash(BigDecimal cash);

    boolean giveCash(BigDecimal cash);

    void takeCash(BigDecimal cash);

    void addHistory(BigDecimal cash, Payable payable, boolean income, TransactionStatus status);
}
