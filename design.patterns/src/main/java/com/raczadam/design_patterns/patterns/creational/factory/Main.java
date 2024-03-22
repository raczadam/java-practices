package com.raczadam.design_patterns.patterns.creational.factory;

public class Main {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal(AnimalType.DOG);
        animal.makeSomeNoise();

        animal = AnimalFactory.createAnimal(AnimalType.COW);
        animal.makeSomeNoise();

        animal = AnimalFactory.createAnimal(AnimalType.CAT);
        animal.makeSomeNoise();
    }

}
