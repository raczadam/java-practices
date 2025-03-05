package com.raczadam.leetcode_practice.medium;

// https://leetcode.com/problems/count-total-number-of-colored-cells/?envType=daily-question&envId=2025-03-05
public class CountTotalNumberOfColoredCells {


    public long coloredCells(int n) {
        return n == 1 ? 1 : (long) Math.pow(n, 2) + (long) Math.pow(n - 1d, 2);
    }


}
