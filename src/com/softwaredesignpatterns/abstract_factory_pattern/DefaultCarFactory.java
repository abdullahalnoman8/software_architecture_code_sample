package com.softwaredesignpatterns.abstract_factory_pattern;

public class DefaultCarFactory {
    public static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;
            case MINI:
                car = new MiniCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;

        }
        return car;
    }
}
