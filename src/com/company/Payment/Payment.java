package com.company.Payment;

import com.company.Payable.Payable;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {

    final private BigDecimal change;
    final private Date date;
    final private Payable source;
    final private Payable target;

    public Payment(BigDecimal change, Date date, Payable source, Payable target) {
        this.change = change;
        this.date = date;
        this.source = source;
        this.target = target;
    }

    public BigDecimal getChange() {
        return change;
    }

    public Date getDate() {
        return date;
    }

    public Payable getSource() {
        return source;
    }

    public Payable getTarget() {
        return target;
    }


}
