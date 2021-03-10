package com.softwaredesignpatterns.practice_decorator;

public class Margheritta extends Pizza{

    public Margheritta() {
        setDescription("Margheritta Pizza");
    }

    @Override
    public double getCost() {
        return 110;
    }
}
