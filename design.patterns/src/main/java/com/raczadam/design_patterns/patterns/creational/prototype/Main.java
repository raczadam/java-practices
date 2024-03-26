package com.raczadam.design_patterns.patterns.creational.prototype;

public class Main {


    public static void main(String[] args) {
        Shape shape = new Square(10, 10);
        shape.draw();

        int hashCodeBeforeCloning = shape.hashCode();
        shape = shape.clone();
        System.out.println(shape.getClass());

        System.out.println(STR."Is hashCode same after cloning? \{hashCodeBeforeCloning == shape.hashCode()}");

        shape = new Rectangle(10, 5);
        shape.draw();

        shape = shape.clone();
        System.out.println(shape.getClass());
    }

}
