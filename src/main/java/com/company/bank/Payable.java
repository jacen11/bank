package com.company.bank;

import java.math.BigDecimal;
import com.company.bank.customer.payment.Payment;

public interface Payable {
    String getUniqueId();

    public void giveCash(BigDecimal amount);

    public boolean takeCash(BigDecimal amount);

    public void addHistory(Payment payment);
}
