package com.raczadam.design_patterns.solid.liskov_substitution;

public class DieselCar extends CarImpl implements FuelCar{


    @Override
    public void fuel() {
        System.out.println("Fueling with diesel");
    }

}
