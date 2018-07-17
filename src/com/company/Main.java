package com.company;

import com.company.Payable.Individual;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Individual client1 = Individual.createIndividual("1234567890");
        Individual client2 = Individual.createIndividual("09876543l1"); //не создастся
        Individual client3 = Individual.createIndividual("0987654321");

        System.out.println(client1.getPassportID());
        //     System.out.println(client2.getPassportID());
        System.out.println(client2 == null);

        System.out.println("Деньги на счету " + client1.getMoney());
        client1.addPayment(new BigDecimal(-50), new Date(), client1, client3);
        System.out.println("Платеж 1 " + client1.getPayments().get(0).getChange());
        System.out.println("Деньги на счету " + client1.getMoney());

        client1.addPayment(new BigDecimal(500), new Date(), client1, client3);
        System.out.println("Платеж 2 " + client1.getPayments().get(1).getChange());
        System.out.println("Деньги на счету " + client1.getMoney());


    }


}
