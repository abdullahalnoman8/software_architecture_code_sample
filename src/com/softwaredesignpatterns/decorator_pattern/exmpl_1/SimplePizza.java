package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class SimplePizza extends Pizza{

    @Override
    public String getDescription() {
     return description = "Simple Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
