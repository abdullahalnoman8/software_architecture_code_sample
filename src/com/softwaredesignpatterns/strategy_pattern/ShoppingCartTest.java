package com.softwaredesignpatterns.strategy_pattern;

import java.time.LocalDate;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart  = new ShoppingCart();
        Item item1 = new Item("Coat","234234", 3443);
        Item item2 = new Item("Shoe","543543",23423);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        LocalDate localDate = LocalDate.now();
        shoppingCart.paymentStrategy(new PaypalStrategy("abc@gmail.com","abc"));
        shoppingCart.paymentStrategy(new CreditCardStrategy("Card Name",
                "Card Number",
                "234",localDate.plusYears(4)));


    }

}
