package com.raczadam.design_patterns.patterns.creational.factory;

public class Dog implements Animal {

    @Override
    public void makeSomeNoise() {
        System.out.println("Woof-woof!");
    }

}
