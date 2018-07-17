package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Individual extends Client {


    private String passportID;
    private double money = 0;
    private ArrayList<Payment> payments = new ArrayList<>();


    Individual(String passportID) {
        if (passportID.toCharArray().length == 10 && isNumeric(passportID)) {
            this.passportID = passportID;
        }
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void addPayment(double change, Date date, Individual source, Individual target) {
        payments.add(new Payment(change, date, source, target));
    }

    public String getPassportID() {
        return passportID;
    }

    private static boolean isNumeric(String str) {
        return str.matches("[-+]?\\d+");
    }
}

