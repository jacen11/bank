package com.company.Bank.Solvers;

public class TransactionStatus {
    private final int code;
    private final String message;

    public TransactionStatus(final int code) {
        this.code = code;
        this.message = "";
    }

    public TransactionStatus(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;

    }
}
