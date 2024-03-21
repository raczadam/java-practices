package com.raczadam.design_patterns.architectural.solid.interface_segregation;

public class Worker implements Employee {

    @Override
    public void salary() {
        System.out.println("Getting salary");
    }

}
