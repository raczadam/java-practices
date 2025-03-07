package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/closest-prime-numbers-in-range/submissions/1566420396/?envType=daily-question&envId=2025-03-07
public class ClosestPrimeNumbersInRange {


    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right + 1];
        for (int i = 0; i <= right; i++)
            prime[i] = true;

        for (int p = 2; p * p <= right; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= right; i += p)
                    prime[i] = false;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(left, 2); i <= right; i++) {
            if (prime[i])
                primes.add(i);
        }
        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }
        int first = 0;
        int last = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < primes.size() - 1; i++) {
            int tempDiff = primes.get(i + 1) - primes.get(i);
            if (tempDiff < diff) {
                diff = tempDiff;
                first = primes.get(i);
                last = primes.get(i + 1);
            }
        }
        return new int[]{first, last};
    }


}
