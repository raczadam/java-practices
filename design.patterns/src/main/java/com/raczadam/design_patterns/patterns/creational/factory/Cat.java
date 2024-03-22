package com.raczadam.design_patterns.patterns.creational.factory;

public class Cat implements Animal {

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow!");
    }

}
