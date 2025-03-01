package com.example.dp.fibonacci;

import java.util.HashMap;

public class FibonacciMemoization {


    private static final HashMap<Integer, Integer> memo = new HashMap<>();


    public static int fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n); // Use cached value
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);  // Store result to avoid recalculating
        return result;
    }


}

