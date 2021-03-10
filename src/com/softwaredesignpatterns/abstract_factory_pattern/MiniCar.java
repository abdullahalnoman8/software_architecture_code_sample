package com.softwaredesignpatterns.abstract_factory_pattern;

public class MiniCar extends Car{
    public MiniCar(Location location) {
        super(CarType.MINI,location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to Mini Car");
    }
}
