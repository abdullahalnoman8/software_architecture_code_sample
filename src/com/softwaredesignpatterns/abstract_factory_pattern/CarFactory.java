package com.softwaredesignpatterns.abstract_factory_pattern;

public class CarFactory {
    private CarFactory() {

    }

    public static Car buildCar(CarType carType){
        Location location = Location.INDIA;
        Car car = null;
        switch (location){
            case USA :
                car = UsaCarFactory.buildCar(carType);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(carType);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
