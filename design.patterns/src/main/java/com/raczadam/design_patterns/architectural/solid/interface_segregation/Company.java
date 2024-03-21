package com.raczadam.design_patterns.architectural.solid.interface_segregation;

public class Company {

    public static void main(String[] args) {
        Employee ceo = new CEOImpl();
        System.out.println("Is CEO CEO? " + (ceo instanceof CEO));
        System.out.println("Is CEO manager? " + (ceo instanceof Manager));
        System.out.println("Is CEO employee?  " + (ceo instanceof Employee));


        Employee manager = new ManagerImpl();
        System.out.println("Is manager CEO? " + (manager instanceof CEO));
        System.out.println("Is manager manager? " + (manager instanceof Manager));
        System.out.println("Is manager employee?  " + (ceo instanceof Employee));


        Employee worker = new Worker();
        System.out.println("Is worker CEO? " + (worker instanceof CEO));
        System.out.println("Is worker manager? " + (worker instanceof Manager));
        System.out.println("Is worker employee?  " + (ceo instanceof Employee));

        CEO nextCeo = new CEOImpl();
        nextCeo.addStocks();
        nextCeo.salary();
        nextCeo.makeDecisions();
        nextCeo.hire();
        nextCeo.train();
        nextCeo.addBonus();

    }

}
