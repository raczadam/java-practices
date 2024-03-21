package com.raczadam.design_patterns.architectural.solid.liskov_substitution;

public class PetrolCar extends CarImpl implements FuelCar{

    @Override
    public void fuel() {
        System.out.println("Fueling with petrol");
    }

}
