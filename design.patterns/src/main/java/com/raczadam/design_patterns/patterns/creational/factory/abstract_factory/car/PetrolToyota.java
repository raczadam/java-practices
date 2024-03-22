package com.raczadam.design_patterns.patterns.creational.factory.abstract_factory.car;

public class PetrolToyota implements PetrolCar {

    @Override
    public void assemble() {
        System.out.println("Assemble a petrol Toyota");
    }

}
