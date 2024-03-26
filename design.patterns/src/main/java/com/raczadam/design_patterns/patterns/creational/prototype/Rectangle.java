package com.raczadam.design_patterns.patterns.creational.prototype;

public class Rectangle extends Shape{


    protected Rectangle(int width, int height) {
        super(width, height);
    }


    @Override
    public void draw() {
        System.out.println(STR."Drawing a Rectangle... Width : \{width}, height : \{height}");
    }


    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }

}
