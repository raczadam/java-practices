package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxSumOfAPairWithEqualSumOfDigits {


    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> precounted = new TreeMap<>();
        for (int num : nums) {
            int sumOfDigit = sumOfDigits(num);
            List<Integer> temp = precounted.getOrDefault(sumOfDigit, new ArrayList<>());
            temp.add(num);
            precounted.put(sumOfDigit, temp);
        }
        precounted
                .values()
                .forEach(list -> list.sort(Collections.reverseOrder()));

        int result = -1;
        for (Map.Entry<Integer, List<Integer>> entry : precounted.entrySet()) {
            if (entry.getValue().size() > 1) {
                int sum = entry.getValue().get(0) + entry.getValue().get(1);
                result = Math.max(result, sum);
            }
        }
        return result;
    }


    private int sumOfDigits(int num) {
        if (num < 10)
            return num;
        return num % 10 + sumOfDigits(num / 10);
    }


}
