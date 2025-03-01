package com.example.dp.fibonacci;

import java.util.function.IntUnaryOperator;

public class FibonacciRunner {


    public static void main(String[] args) {
        int number = 46; // largest fibo number what we can store in an int
        System.out.println(runFibonacci("recursive", number, FibonacciRecursive::fib));
        System.out.println(runFibonacci("memoization", number, FibonacciMemoization::fib));
        System.out.println(runFibonacci("tabulation", number, FibonacciTabulation::fib));
    }


    public static int runFibonacci(String type, int number, IntUnaryOperator function) {
        long startTime = System.currentTimeMillis();
        int result = function.applyAsInt(number);
        System.out.println("Fibonacci of " + number + " is: " + result + " with this type of solution: " + type);
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + " ms");
        return result;
    }


}
