package com.raczadam.design_patterns.patterns.creational.prototype;

public abstract class Shape implements Cloneable {


    protected int width;
    protected int height;

    protected Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void draw();

    public abstract Shape clone();

}
