package com.raczadam.leetcode_practice.utility;

import java.util.Arrays;

public class IntUtil {


    private IntUtil() {
    }


    public static int[] reduceTwoDimensionalArray(int[][] base) {
        int length = 0;
        if (base != null) {
            for (int[] value : base) {
                length += value.length;
            }
            int[] result = new int[length];
            int counter = 0;
            for (int[] ints : base) {
                for (int anInt : ints) {
                    result[counter] = anInt;
                    counter++;
                }
            }
            return result;
        }
        return new int[length];
    }

    public static int[] reduceAndSortTwoDimensionalArray(int[][] base) {
        int[] result = reduceTwoDimensionalArray(base);
        Arrays.sort(result);
        return result;
    }

}
