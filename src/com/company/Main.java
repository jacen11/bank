package com.company;

import com.company.Bank.PoorBank;
import com.company.Customer.Customer;
import com.company.Customer.PersonalCustomer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Customer client1 = new PersonalCustomer("login1","password1", BigDecimal.valueOf(1000),"1111111111");
        Customer client2 = new PersonalCustomer("login2","password2", BigDecimal.valueOf(2000),"2222222222");
        Customer client3 = new PersonalCustomer("login3","password3", BigDecimal.valueOf(3000),"3333333333");
        Map<String,Customer> clients = new HashMap<>();
        clients.put(client1.getLogin(),client1);
        clients.put(client2.getLogin(),client2);
        clients.put(client3.getLogin(),client3);
        PoorBank bank = new PoorBank(clients);
        bank.createTask(client1,client2,BigDecimal.valueOf(500));
        System.out.println(client1.getCash());
        System.out.println(client2.getCash());
    }
}
