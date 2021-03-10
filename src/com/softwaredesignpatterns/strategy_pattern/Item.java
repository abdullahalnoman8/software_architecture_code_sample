package com.softwaredesignpatterns.strategy_pattern;

public class Item {
    private String name;
    private String itemCode;
    private double itemPrice;

    public Item(String name, String itemCode, double itemPrice) {
        this.name = name;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
    }

    public String getName() {
        return name;
    }

    public String getItemCode() {
        return itemCode;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
