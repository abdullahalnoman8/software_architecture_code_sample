package com.softwaredesignpatterns.practice_decorator.topping;

import com.softwaredesignpatterns.practice_decorator.Pizza;
import com.softwaredesignpatterns.practice_decorator.ToppingDecorator;

public class Barbeque extends ToppingDecorator {

    Pizza pizza;


    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Barbeque.";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}
