package com.softwaredesignpatterns.practice_decorator.topping;

import com.softwaredesignpatterns.practice_decorator.Pizza;
import com.softwaredesignpatterns.practice_decorator.ToppingDecorator;

public class Paneer extends ToppingDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Panner.";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}
