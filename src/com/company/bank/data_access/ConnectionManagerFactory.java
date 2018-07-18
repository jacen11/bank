package com.company.bank.data_access;

import com.company.bank.data_access.ConnectionManager;

public class ConnectionManagerFactory {
    public static ConnectionManager getConnectionManager() {
        return new ConnectionManager();
    }
}
