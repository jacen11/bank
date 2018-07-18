package com.company.bank.data_access;


import com.company.bank.data_access.ConnectionBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager implements ConnectionBuilder {

    ConnectionManager() {
        try {
            Class.forName("org.postgresql.Driver");
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        String url = "";
        String login = "";
        String password = "";
        return DriverManager.getConnection(url, login, password);
    }
}
