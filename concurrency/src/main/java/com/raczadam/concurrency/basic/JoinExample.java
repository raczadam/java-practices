package com.raczadam.concurrency.basic;

import com.raczadam.concurrency.Util;

public class JoinExample {


    public static void main(String[] args) throws InterruptedException {
        Thread newThread = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                Util.sleep(1000L);
                System.out.println("MyRunnable - running");
            }
            System.out.println(Thread.currentThread() + " stopped, go back to the main thread.");
        });
        newThread.start();

        System.out.println("Main thread join to newThread (and will wait until it is finished)");
        newThread.join();

        System.out.println("newThread finished execution");
    }


}
