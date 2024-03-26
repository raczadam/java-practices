package com.raczadam.design_patterns.patterns.creational.prototype;

public class Square extends Shape {


    protected Square(int width, int height) {
        super(width, height);
        assert width == height;  // width, and height should be equal
    }


    @Override
    public void draw() {
        System.out.println(STR."Drawing a Square... Side : \{width}");
    }


    @Override
    public Shape clone() {
        return new Square(this.width, this.height);
    }


}
