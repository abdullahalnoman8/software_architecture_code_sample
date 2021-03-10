package com.softwaredesignpatterns.practice_decorator;

import com.softwaredesignpatterns.practice_decorator.topping.FreshTomato;
import com.softwaredesignpatterns.practice_decorator.topping.Paneer;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new Margheritta();
        System.out.println(pizza.getDescription() + " Cost :" + pizza.getCost());

        Pizza pizza1 = new FarmHouse();

        pizza1 = new FreshTomato(pizza1);

        pizza1 = new Paneer(pizza1);

        System.out.println(pizza1.getDescription() + " Cost: " + pizza1.getCost());
    }
}
