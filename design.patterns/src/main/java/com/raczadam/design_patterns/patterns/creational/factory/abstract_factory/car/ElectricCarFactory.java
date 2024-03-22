package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car;

public class ElectricCarFactory implements CarFactory {

    @Override
    public ElectricCar createCar(CarType carType) {
        return switch (carType) {
            case TOYOTA -> new ElectricToyota();
            case FORD -> new ElectricFord();
        };
    }

}
