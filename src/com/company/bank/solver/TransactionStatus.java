package com.company.bank.solver;

public enum TransactionStatus {
    OK(""),
    ERROR("Something went wrong");

    private final String message;

    TransactionStatus(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
