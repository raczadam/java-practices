package com.raczadam.design_patterns.principles.solid.interface_segregation;

public class CEOImpl extends ManagerImpl implements CEO {

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions");
    }

    @Override
    public void addStocks() {
        System.out.println("Adding stocks");
    }

}
