package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class FarmHouse extends Pizza{

    @Override
    public String getDescription() {
        return description = "FarmHouse Pizza";
    }

    @Override
    public double getCost() {
        return 60;
    }
}
