package com.raczadam.design_patterns.patterns.creational.factory;

public class Cow implements Animal {

    @Override
    public void makeSomeNoise() {
        System.out.println("Mooo!");
    }

}
