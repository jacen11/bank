package com.company.Payment;

import com.company.Client.Individual;

import java.util.Date;

public class Payment {

    private double change;
    private Date date;
    private Individual source;
    private Individual target;

    public Payment(double change, Date date, Individual source, Individual target) {
        this.change = change;
        this.date = date;
        this.source = source;
        this.target = target;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Individual getSource() {
        return source;
    }

    public void setSource(Individual source) {
        this.source = source;
    }

    public Individual getTarget() {
        return target;
    }

    public void setTarget(Individual target) {
        this.target = target;
    }
}
