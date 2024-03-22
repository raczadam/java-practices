package com.raczadam.design_patterns.patterns.creational.singleton;

public class LazyDatabaseConnector implements DatabaseConnector {

    private LazyDatabaseConnector() {
    }

    private static LazyDatabaseConnector INSTANCE;

    @Override
    public void connect() {
        System.out.println(STR."Connecting to a database... (with \{this.getClass().getSimpleName()})");
    }

    @Override
    public void disconnect() {
        System.out.println(STR."Disconnecting from a database... (with \{this.getClass().getSimpleName()})");
    }

    public static LazyDatabaseConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyDatabaseConnector();
        }
        return INSTANCE;
    }
}
