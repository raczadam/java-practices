package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car;

public class ElectricToyota implements ElectricCar {

    @Override
    public void assemble() {
        System.out.println("Assemble an electric Toyota");
    }

}
