package com.company.bank.data_access;

import com.company.customer.Customer;
import com.company.customer.PersonalCustomer;

public class PersonalCustomerManager implements CustomerDAO {
    public static final String INSERT = "INSERT INTO";

    @Override
    public Long addCustomer(Customer customer) {
        return null;
    }

    @Override
    public void updateCustomerInfo(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomer(String login) {
        return null;
    }

    @Override
    public Customer getCustomer(Long customerID) {
        return null;
    }
}
