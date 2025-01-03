package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-ways-to-split-array/description/?envType=daily-question&envId=2025-01-03
public class NumberOfWaysToSplitArray {

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] preCounted = Arrays.stream(nums).asLongStream().toArray();
        for (int i = 1; i < n; i++) {
            preCounted[i] += preCounted[i - 1];
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (preCounted[i] >= (preCounted[n - 1] - preCounted[i])) {
                count++;
            }
        }
        return count;
    }

}
