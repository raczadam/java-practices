package com.raczadam;

public class BasicThreadExample {


    public static void main(String[] args) {
        Thread thread = new Thread(Thread.currentThread().getThreadGroup(), new MyRunnable());
        thread.start();
        System.out.println(thread);
        System.out.println(Thread.currentThread());
    }


    private static class MyRunnable implements Runnable {


        @Override
        public void run() {
            System.out.println("MyRunnable started");
            System.out.println("MyRunnable finished");
        }


    }


}