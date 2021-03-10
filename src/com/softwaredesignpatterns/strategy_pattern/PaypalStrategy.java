package com.softwaredesignpatterns.strategy_pattern;

public class PaypalStrategy implements PaymentStrategy{

    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by paypal");
    }
}
