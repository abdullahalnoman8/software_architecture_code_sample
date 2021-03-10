package com.softwaredesignpatterns.practice_decorator;

public abstract class Pizza {
    private String name;
    private String description = "Unknown Pizza";


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getCost();
}
