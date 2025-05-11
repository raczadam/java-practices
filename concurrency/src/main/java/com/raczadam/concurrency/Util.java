package com.raczadam.concurrency;

public class Util {


    private Util() {
        throw new UnsupportedOperationException("No instance for you");
    }


    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }


}
