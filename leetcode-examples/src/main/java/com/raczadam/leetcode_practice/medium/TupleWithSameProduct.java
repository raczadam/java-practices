package com.raczadam.leetcode_practice.medium;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {


    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                result += map.getOrDefault(product, 0);
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        return result * 8;
    }


}