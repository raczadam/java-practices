package com.raczadam.leetcode_practice.easy;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=daily-question&envId=2025-10-20
public class FinalValueAfterOperation {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.contains("-")) {
                result--;
            } else {
                result++;
            }
        }
        return result;
    }

}
