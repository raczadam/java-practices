package com.example.dp.fibonacci;

public class FibonacciTabulation {


    public static int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];  // Build up from smaller subproblems
        }
        return dp[n];
    }


}
