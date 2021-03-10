package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class Barbeque extends ToppingsGenerator{

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Barbeque";
    }

    @Override
    public double getCost() {
        return 55 + pizza.getCost();
    }
}
