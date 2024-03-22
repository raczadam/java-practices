package com.raczadam.design_patterns.patterns.creational.singleton;

public class EagerDatabaseConnector implements DatabaseConnector {


    private EagerDatabaseConnector() {
    }

    private static final EagerDatabaseConnector INSTANCE = new EagerDatabaseConnector();

    @Override
    public void connect() {
        System.out.println(STR."Connecting to a database... (with \{this.getClass().getSimpleName()})");
    }

    @Override
    public void disconnect() {
        System.out.println(STR."Disconnecting from a database... (with \{this.getClass().getSimpleName()})");
    }

    public static EagerDatabaseConnector getInstance() {
        return INSTANCE;
    }

}
