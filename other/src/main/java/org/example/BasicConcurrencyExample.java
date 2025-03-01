package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class BasicConcurrencyExample {


    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final count: " + counter.getCount());
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + " ms");
    }


}


class Counter {
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}