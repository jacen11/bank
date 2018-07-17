package com.company;

import com.company.Client.Individual;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Individual client1 = new Individual("1234567890");
        Individual client2 = new Individual("09876543f1"); //не создастся
        Individual client3 = new Individual("0987654321");

        System.out.println(client1.getPassportID());
        System.out.println(client2.getPassportID());

       client1.addPayment(50, new Date(), client1,client3);

        System.out.println( client1.getPayments().get(0).getChange());


    }


}
