package com.raczadam.design_patterns.patterns.behavioral.observer;

public class SellStockListener implements Observer {


    @Override
    public void update(double price) {
        if (price > 105) {
            System.out.println("Selling stock, because S(t) prices are low...");
        }
    }


}
