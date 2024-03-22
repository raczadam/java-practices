package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory;

import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.CarFactory;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.CarFactoryType;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.ElectricCarFactory;
import com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car.PetrolCarFactory;

public class CarFactoryProducer {


    public static CarFactory createCarFactory(CarFactoryType carFactoryType){
        return switch (carFactoryType){
            case PETROL -> new PetrolCarFactory();
            case ELECTRIC -> new ElectricCarFactory();
        };
    }

}
