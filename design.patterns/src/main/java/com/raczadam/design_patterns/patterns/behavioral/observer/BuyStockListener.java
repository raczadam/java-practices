package com.raczadam.design_patterns.patterns.behavioral.observer;

public class BuyStockListener implements Observer {


    @Override
    public void update(double price) {
        if (price < 95) {
            System.out.println("Buying stock, because S(t) prices are low...");
        }
    }


}
