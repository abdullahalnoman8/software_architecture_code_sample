package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class Paneer extends ToppingsGenerator{

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Paneer.";
    }

    @Override
    public double getCost() {
        return 22 + pizza.getCost();
    }
}
