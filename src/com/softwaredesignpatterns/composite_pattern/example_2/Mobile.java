package com.softwaredesignpatterns.composite_pattern.example_2;

public class Mobile implements Gadget{
    private String brand;
    private String model;
    private Double price;

    public Mobile(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void showGadgetDetails() {
        System.out.println("Brand Name:  "+ getBrand() + " Model: " + getModel() + " Price: " + getPrice());
    }
}
