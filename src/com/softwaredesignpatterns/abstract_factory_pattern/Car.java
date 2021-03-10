package com.softwaredesignpatterns.abstract_factory_pattern;

public abstract class Car{

    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    public Car(Location location) {
        this.location = location;
    }

    abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
