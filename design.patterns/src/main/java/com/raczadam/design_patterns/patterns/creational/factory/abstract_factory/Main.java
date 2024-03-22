package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory;

import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.Car;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.CarFactory;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.CarFactoryType;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.CarType;

public class Main {

    public static void main(String[] args) {
        CarFactory electricCarFactory = CarFactoryProducer.createCarFactory(CarFactoryType.ELECTRIC);

        Car electricToyota = electricCarFactory.createCar(CarType.TOYOTA);
        electricToyota.assemble();

        Car electricFord = electricCarFactory.createCar(CarType.FORD);
        electricFord.assemble();

        CarFactory petrolCarFactory = CarFactoryProducer.createCarFactory(CarFactoryType.PETROL);

        Car petrolToyota = petrolCarFactory.createCar(CarType.TOYOTA);
        petrolToyota.assemble();

        Car petrolFord = petrolCarFactory.createCar(CarType.FORD);
        petrolFord.assemble();
    }

}
