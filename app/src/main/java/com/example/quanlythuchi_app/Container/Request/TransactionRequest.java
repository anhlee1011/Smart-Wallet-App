package com.example.quanlythuchi_app.Container.Request;

import java.sql.Date;

public class TransactionRequest {
    private String name;

    private Long amount;

    private String location;

    private String transactiondate;

    private String description;

    public TransactionRequest(String name, Long amount, String location, String transactiondate, String description) {
        this.name = name;
        this.amount = amount;
        this.location = location;
        this.transactiondate = transactiondate;
        this.description = description;
    }
}
