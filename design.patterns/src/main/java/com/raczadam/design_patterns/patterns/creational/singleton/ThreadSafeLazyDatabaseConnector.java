package com.raczadam.design_patterns.patterns.creational.singleton;

public class ThreadSafeLazyDatabaseConnector implements DatabaseConnector {


    private ThreadSafeLazyDatabaseConnector() {
    }

    private static ThreadSafeLazyDatabaseConnector INSTANCE;

    @Override
    public void connect() {
        System.out.println(STR."Connecting to a database... (with \{this.getClass().getSimpleName()})");
    }

    @Override
    public void disconnect() {
        System.out.println(STR."Disconnecting from a database... (with \{this.getClass().getSimpleName()})");
    }

    public static ThreadSafeLazyDatabaseConnector getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeLazyDatabaseConnector.class) {
                INSTANCE = new ThreadSafeLazyDatabaseConnector();
            }
        }
        return INSTANCE;
    }

}
