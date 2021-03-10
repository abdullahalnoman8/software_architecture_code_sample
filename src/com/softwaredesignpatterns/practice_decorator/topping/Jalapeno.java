package com.softwaredesignpatterns.practice_decorator.topping;

import com.softwaredesignpatterns.practice_decorator.Pizza;
import com.softwaredesignpatterns.practice_decorator.ToppingDecorator;

public class Jalapeno extends ToppingDecorator {

    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Jalapeno.";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}
