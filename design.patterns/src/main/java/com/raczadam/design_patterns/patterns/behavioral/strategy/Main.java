package com.raczadam.design_patterns.patterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        ImageManager manager = new ImageManager();

        manager.setRenderer(new TVRenderer());
        manager.show();

        manager.setRenderer(new LaptopRenderer());
        manager.show();

        manager.setRenderer(new SmartphoneRenderer());
        manager.show();
    }

}
