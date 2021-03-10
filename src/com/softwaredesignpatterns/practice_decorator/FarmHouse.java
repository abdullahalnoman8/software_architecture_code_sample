package com.softwaredesignpatterns.practice_decorator;

public class FarmHouse extends Pizza{

    public FarmHouse() {
        setDescription("Farmhouse Pizza");
    }

    @Override
    public double getCost() {
        return 120;
    }
}
