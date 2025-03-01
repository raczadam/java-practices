package com.example.dp.fibonacci;

public class FibonacciRecursive {


    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);  // Recalculating same values many times!
    }


}

