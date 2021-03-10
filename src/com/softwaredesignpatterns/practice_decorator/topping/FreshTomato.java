package com.softwaredesignpatterns.practice_decorator.topping;

import com.softwaredesignpatterns.practice_decorator.Pizza;
import com.softwaredesignpatterns.practice_decorator.ToppingDecorator;

public class FreshTomato extends ToppingDecorator{
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Fresh Tomato.";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 55;
    }
}
