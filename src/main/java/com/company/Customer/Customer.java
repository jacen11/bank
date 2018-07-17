package com.company.Customer;

import java.math.BigDecimal;

public abstract class Customer implements Payable{
    private final String login;
    private String password;
    private BigDecimal cash;

    Customer(final String login, final String password, final BigDecimal cash) {
        this.login = login;
        this.password = password;
        this.cash = cash;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getCash() {
        return cash;
    }

    protected void setCash(final BigDecimal cash) {
        this.cash = cash;
    }
}
