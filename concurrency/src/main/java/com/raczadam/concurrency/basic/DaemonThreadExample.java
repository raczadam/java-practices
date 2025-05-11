package com.raczadam.concurrency.basic;

import com.raczadam.concurrency.Util;

public class DaemonThreadExample {


    public static void main(String[] args) {
        Thread newThread = new Thread(myRunnable());
        newThread.setDaemon(true);
        newThread.start();

        Util.sleep(3000);
        System.out.println("Main thread stopped");
        System.out.println("newThread will stop too.");
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
