package com.raczadam.leetcode_practice.easy;

// https://leetcode.com/problems/apply-operations-to-an-array/submissions/1558964524/?envType=daily-question&envId=2025-03-01
public class ApplyOperationsToAnArray {


    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int position = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                result[position] = nums[i] * 2;
                nums[i + 1] = 0;
                position++;
            } else if (nums[i] != 0) {
                result[position] = nums[i];
                position++;
            }
        }
        if (nums[nums.length - 1] != 0 && nums[nums.length - 1] != nums[nums.length - 2]) {
            result[position] = nums[nums.length - 1];
        }
        return result;
    }


}
