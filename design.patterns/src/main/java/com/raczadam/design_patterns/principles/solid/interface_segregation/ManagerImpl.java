package com.raczadam.design_patterns.principles.solid.interface_segregation;

public class ManagerImpl extends Worker implements Manager {

    @Override
    public void hire() {
        System.out.println("Hiring new workers");
    }

    @Override
    public void train() {
        System.out.println("Training coworkers");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus");
    }

}
