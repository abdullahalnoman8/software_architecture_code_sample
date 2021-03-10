package com.softwaredesignpatterns.practice_decorator;

public class PeppyPanner extends Pizza{

    public PeppyPanner() {
        setDescription("PeppyPanner");
    }

    @Override
    public double getCost() {
        return 100;
    }
}
