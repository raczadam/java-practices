package com.raczadam.design_patterns.patterns.creational.factory;

public class AnimalFactory {


    public static Animal createAnimal(AnimalType animalType) {
        return switch (animalType) {
            case DOG -> new Dog();
            case CAT -> new Cat();
            case COW -> new Cow();
        };
    }

}
