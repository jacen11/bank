package com.company.bank.data_access;

import com.company.customer.Customer;

public interface CustomerDAO {
    public Long addCustomer(Customer customer);
    public void updateCustomerInfo(Customer customer);
    public void deleteCustomer(Customer customer);
    public Customer getCustomer(String login);
    public Customer getCustomer(Long customerID);
}
