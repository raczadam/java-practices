package com.raczadam.design_patterns.patterns.behavioral.observer;

public interface Subject {


    void addObserver(Observer observer);

    void notifyAllObservers();


}
