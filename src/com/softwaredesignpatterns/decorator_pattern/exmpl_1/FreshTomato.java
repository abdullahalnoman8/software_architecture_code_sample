package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class FreshTomato extends ToppingsGenerator{

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " FreshTomato";
    }

    @Override
    public double getCost() {
        return 40 + pizza.getCost();
    }
}
