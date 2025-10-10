package com.raczadam.concurrency.basic;

import com.raczadam.concurrency.Util;

public class RunningAfterMainThreadExample {


    public static void main(String[] args) {
        Thread newThread = new Thread(myRunnable());
        newThread.start();

        Util.sleep(3000);
        System.out.println("Main thread stopped - but newThread will run forever, if you don't kill it");
    }


    private static Runnable myRunnable() {
        return () -> {
            while (true) {
                Util.sleep(1000L);
                System.out.println("MyRunnable - running");
            }
        };
    }


}
