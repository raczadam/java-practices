package com.raczadam.design_patterns.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {


    private final Random random = new Random();
    private final List<Observer> observers = new ArrayList<>();
    private double price = 100;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void notifyAllObservers() {
        observers.forEach(o -> o.update(price));
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            delay(500);
            price = price + 2 * random.nextDouble() - 1;
            notifyAllObservers();
            System.out.println(price);
        }
    }


    private void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
