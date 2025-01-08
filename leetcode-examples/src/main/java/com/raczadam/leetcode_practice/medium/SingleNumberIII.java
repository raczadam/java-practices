package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;

public class SingleNumberIII {


    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int resultIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                result[resultIndex] = nums[i];
                resultIndex++;
                if (resultIndex > 1) {
                    break;
                }
            } else {
                i++;
            }
        }
        if (resultIndex == 1) {
            result[1] = nums[nums.length - 1];
        }
        return result;
    }


}
