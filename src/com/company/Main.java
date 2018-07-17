package com.company;

import com.company.bank.PoorBank;
import com.company.customer.Customer;
import com.company.customer.PersonalCustomer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Customer client1 = new PersonalCustomer("login1","password1", BigDecimal.valueOf(1000),"1111111111");
        Customer client2 = new PersonalCustomer("login2","password2", BigDecimal.valueOf(2000),"2222222222");
        PoorBank.solveTask(client1,client2,BigDecimal.valueOf(500));
        System.out.println(client1.getCash());
        System.out.println(client2.getCash());
    }
}
