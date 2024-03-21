package com.raczadam.design_patterns.architectural.solid.interface_segregation;

public interface Manager extends Employee {

    // managers
    void hire();

    void train();

    // CEO + managers
    void addBonus();

}
