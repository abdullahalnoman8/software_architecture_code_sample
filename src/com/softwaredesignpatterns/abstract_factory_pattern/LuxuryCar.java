package com.softwaredesignpatterns.abstract_factory_pattern;

public class LuxuryCar extends Car{


    public LuxuryCar(Location location) {
        super(CarType.LUXURY,location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to luxury car");
    }
}
