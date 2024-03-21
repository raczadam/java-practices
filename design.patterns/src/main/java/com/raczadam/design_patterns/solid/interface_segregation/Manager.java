package com.raczadam.design_patterns.solid.interface_segregation;

public interface Manager extends Employee {

    // managers
    void hire();

    void train();

    // CEO + managers
    void addBonus();

}
