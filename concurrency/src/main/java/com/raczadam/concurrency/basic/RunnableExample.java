package com.raczadam.concurrency.basic;

public class RunnableExample {


    public static void main(String[] args) {
        System.out.println("Main method invoked");
        Thread thread = new Thread(()
                -> System.out.println("Runnable run() method invoked, Thread name: " + Thread.currentThread().getName()));
        thread.start();
        System.out.println("New thread's name: " + thread.getName());
        System.out.println("Main thread's name: " + Thread.currentThread());
    }


}
