package com.company.bank.customer.common;

public class PersonalCustomer extends Customer {
    private final String passportId;

    public PersonalCustomer(final String login, final String password, final String passportId) {
        super(login, password);
        this.passportId = passportId;
    }

    public String getPassportId() {
        return passportId;

    }

    @Override
    public String getUniqueId() {
        return passportId;
    }

}

