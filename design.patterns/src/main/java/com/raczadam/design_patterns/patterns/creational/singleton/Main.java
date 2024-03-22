package com.raczadam.design_patterns.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        DatabaseConnector databaseConnector = EagerDatabaseConnector.getInstance();
        databaseConnector.connect();
        databaseConnector.disconnect();

        databaseConnector = LazyDatabaseConnector.getInstance();
        databaseConnector.connect();
        databaseConnector.disconnect();

        databaseConnector = ThreadSafeLazyDatabaseConnector.getInstance();
        databaseConnector.connect();
        databaseConnector.disconnect();

        databaseConnector = EnumeratedDatabaseConnector.INSTANCE;
        databaseConnector.connect();
        databaseConnector.disconnect();
    }

}
