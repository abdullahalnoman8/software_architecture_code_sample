package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        Pizza pizza1 = new FarmHouse();
        Pizza pizza2 = new FreshTomato(pizza1);
        pizza2 = new Paneer(pizza2);

        System.out.println(pizza2.getDescription() + " Cost : " + pizza2.getCost());

        Pizza pizza3 = new Barbeque(pizza);
        System.out.println( pizza3.getDescription() + "  Cost :" + pizza3.getCost());
    }
}
