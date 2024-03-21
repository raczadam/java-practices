package com.raczadam.design_patterns.principles.solid.interface_segregation;

public class Company {

    public static void main(String[] args) {
        Employee ceo = new CEOImpl();
        System.out.println(STR."Is CEO CEO? \{ceo instanceof CEO}");
        System.out.println(STR."Is CEO manager? \{ceo instanceof Manager}");
        System.out.println(STR."Is CEO employee?  \{ceo instanceof Employee}");


        Employee manager = new ManagerImpl();
        System.out.println(STR."Is manager CEO? \{manager instanceof CEO}");
        System.out.println(STR."Is manager manager? \{manager instanceof Manager}");
        System.out.println(STR."Is manager employee?  \{ceo instanceof Employee}");


        Employee worker = new Worker();
        System.out.println(STR."Is worker CEO? \{worker instanceof CEO}");
        System.out.println(STR."Is worker manager? \{worker instanceof Manager}");
        System.out.println(STR."Is worker employee?  \{ceo instanceof Employee}");

        CEO nextCeo = new CEOImpl();
        nextCeo.addStocks();
        nextCeo.salary();
        nextCeo.makeDecisions();
        nextCeo.hire();
        nextCeo.train();
        nextCeo.addBonus();

    }

}
