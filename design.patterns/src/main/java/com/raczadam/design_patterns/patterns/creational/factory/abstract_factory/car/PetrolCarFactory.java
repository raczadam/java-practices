package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car;

public class PetrolCarFactory implements CarFactory {

    @Override
    public PetrolCar createCar(CarType carType) {
        return switch (carType) {
            case TOYOTA -> new PetrolToyota();
            case FORD -> new PetrolFord();
        };
    }

}
