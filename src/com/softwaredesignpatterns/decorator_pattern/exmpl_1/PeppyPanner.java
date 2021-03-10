package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public class PeppyPanner extends Pizza{

    @Override
    public String getDescription() {
        return description = "PeppyPanner";
    }

    @Override
    public double getCost() {
        return 40;
    }
}
