package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class ChickenFiesta extends Pizza{

    @Override
    public String getDescription() {
        return description = "ChickenFiesta Pizza";
    }

    @Override
    public double getCost() {
        return 76;
    }
}
