package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-ways-to-split-array/description/?envType=daily-question&envId=2025-01-03
public class NumberOfWaysToSplitArray {

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] preCountedLeft = Arrays.stream(nums).asLongStream().toArray();
        long[] preCountedRight = Arrays.copyOf(preCountedLeft, n);
        for (int i = 1; i < n - 1; i++) {
            preCountedLeft[i] += preCountedLeft[i - 1];
        }
        for (int i = n - 2; i > 0; i--) {
            preCountedRight[i] += preCountedRight[i + 1];
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if(preCountedLeft[i] >= preCountedRight[i + 1]){
                count++;
            }
        }
        return count;
    }

}
