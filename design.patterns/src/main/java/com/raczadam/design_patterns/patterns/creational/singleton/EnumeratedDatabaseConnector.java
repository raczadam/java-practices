package com.raczadam.design_patterns.patterns.creational.singleton;

public enum EnumeratedDatabaseConnector implements DatabaseConnector {

    INSTANCE;

    @Override
    public void connect() {
        System.out.println(STR."Connecting to a database... (with \{this.getClass().getSimpleName()})");
    }

    @Override
    public void disconnect() {
        System.out.println(STR."Disconnecting from a database... (with \{this.getClass().getSimpleName()})");
    }


}
