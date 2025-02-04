package com.raczadam.leetcode_practice.easy;

public class MaximumAscendingSubarraySum {


    public int maxAscendingSum(int[] nums) {
        int largestSum = nums[0];
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                tempSum += nums[i];
                largestSum = Math.max(tempSum, largestSum);
            } else {
                tempSum = nums[i];
            }
        }
        return largestSum;
    }


}
