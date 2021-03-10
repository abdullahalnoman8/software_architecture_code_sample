package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class Margherita extends Pizza{

    Pizza pizza;

    @Override
    public String getDescription() {
        return description = "Margherita";
    }

    @Override
    public double getCost() {
        return 33 ;
    }
}
