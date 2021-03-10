package com.softwaredesignpatterns.strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }
    public void removeItem(Item item){
        itemList.remove(item);
    }

    public double amountCalculation(){
        double sum = 0.0;
        for (Item item: itemList) {
            sum +=item.getItemPrice();
        }
        return sum;
    }

    public void paymentStrategy(PaymentStrategy paymentStrategy){
        double amount = amountCalculation();
        paymentStrategy.pay(amount);
    }
}
