package com.company.Payable;

import com.company.Payment.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.math.MathContext;

public class Individual extends Client {

    private String passportID;
    private BigDecimal money = new BigDecimal(0);
    private ArrayList<Payment> payments = new ArrayList<>();

    private Individual(String passportID) {
        this.passportID = passportID;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void addPayment(BigDecimal change, Date date, Individual source, Individual target) {
        payments.add(new Payment(change, date, source, target));

        money = money.add(change);

        BigDecimal moneyTarget = target.getMoney();

        moneyTarget = moneyTarget.add(change.multiply(BigDecimal.valueOf(-1)));
        target.setMoney(moneyTarget);


    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPassportID() {
        return passportID;
    }

    private static boolean isNumeric(String str) {
        return str.matches("[-+]?\\d+");
    }

    public BigDecimal getMoney() {
        return money;
    }

    public static Individual createIndividual(String passportID) {
        if (passportID.toCharArray().length == 10 && isNumeric(passportID)) {
            return new Individual(passportID);
        }
        return null;
    }
}

