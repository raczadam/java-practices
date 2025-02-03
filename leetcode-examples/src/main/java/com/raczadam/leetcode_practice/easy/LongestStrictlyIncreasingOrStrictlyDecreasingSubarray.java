package com.raczadam.leetcode_practice.easy;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {


    public int longestMonotonicSubArray(int[] nums) {
        int longestAsc = 1;
        int longestDesc = 1;
        int longestAscTemp = 1;
        int longestDescTemp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                longestAscTemp++;
                longestAsc = Math.max(longestAscTemp, longestAsc);
            } else if (nums[i] > nums[i + 1]) {
                longestDescTemp++;
                longestDesc = Math.max(longestDescTemp, longestDesc);
            } else {
                longestAscTemp = 1;
                longestDescTemp = 1;
            }
        }
        return Math.max(longestAsc, longestDesc);
    }


}
