package com.raczadam.leetcode_practice.easy;

// https://leetcode.com/problems/find-missing-and-repeated-values/?envType=daily-question&envId=2025-03-06
public class FindMissingAndRepeatedValues {


    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] temp = new int[grid.length * grid[0].length + 1];
        int[] result = new int[2];

        for (int[] row : grid) {
            for (int element : row) {
                temp[element]++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2) {
                result[0] = i;
            }
            if (temp[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }


}
