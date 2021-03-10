package com.softwaredesignpatterns.decorator_pattern.exmpl_1;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
