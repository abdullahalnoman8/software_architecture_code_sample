package com.softwaredesignpatterns.strategy_pattern;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private LocalDate dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, LocalDate dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid by credit card");
    }
}
