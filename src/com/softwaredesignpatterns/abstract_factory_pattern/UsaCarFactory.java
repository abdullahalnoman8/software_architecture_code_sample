package com.softwaredesignpatterns.abstract_factory_pattern;

public class UsaCarFactory {
    static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MINI :
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
        }
        return car;
    }
}
