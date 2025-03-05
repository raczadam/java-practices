package com.raczadam.leetcode_practice.medium;

public class CountTotalNumberOfColoredCells {


    public long coloredCells(int n) {
        return n == 1 ? 1 : (long) Math.pow(n, 2) + (long) Math.pow(n - 1d, 2);
    }


}
