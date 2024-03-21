package com.raczadam.design_patterns.solid.liskov_substitution;

public class ElectricCarImpl extends CarImpl implements ElectricCar{

    @Override
    public void charge() {
        System.out.println("Charging");
    }

}
