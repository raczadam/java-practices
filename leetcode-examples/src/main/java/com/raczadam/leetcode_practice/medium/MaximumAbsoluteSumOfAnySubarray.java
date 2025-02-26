package com.raczadam.leetcode_practice.medium;

// https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/?envType=daily-question&envId=2025-02-26
public class MaximumAbsoluteSumOfAnySubarray {


    public int maxAbsoluteSum(int[] nums) {
        int highestSum = Integer.MIN_VALUE;
        int currentHighestSum = 0;
        int lowestSum = Integer.MAX_VALUE;
        int currentLowestSum = 0;
        for (int element : nums) {
            currentHighestSum = Math.max(element, currentHighestSum + element);
            highestSum = Math.max(highestSum, currentHighestSum);
            currentLowestSum = Math.min(element, currentLowestSum + element);
            lowestSum = Math.min(lowestSum, currentLowestSum);
        }
        return Math.max(highestSum, Math.abs(lowestSum));
    }


}
