package com.softwaredesignpatterns.practice_decorator;

public class ChickenFiesta extends Pizza{

    public ChickenFiesta() {
        setDescription("Chicken Fiesta");
    }

    @Override
    public double getCost() {
        return 130;
    }
}
