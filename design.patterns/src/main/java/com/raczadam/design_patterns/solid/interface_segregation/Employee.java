package com.raczadam.design_patterns.solid.interface_segregation;

// fat interface
public interface Employee {
    // CEO + managers + workers
    public void salary();

    // managers
    public void hire();

    public void train();

    // CEO + managers
    public void addBonus();

    // CEO
    public void makeDecisions();

    public void addStocks();
}