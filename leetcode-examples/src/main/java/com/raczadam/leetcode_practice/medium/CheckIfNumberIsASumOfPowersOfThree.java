package com.raczadam.leetcode_practice.medium;

// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=daily-question&envId=2025-03-04
public class CheckIfNumberIsASumOfPowersOfThree {


    private static final int[] pows;

    static {
        pows = new int[17];
        for (int i = 0; i < pows.length; i++) {
            pows[i] = (int) Math.pow(3, i);
        }
    }

    public boolean checkPowersOfThree(int n) {
        for (int i = pows.length - 1; i >= 0; i--) {
            int subtraction = n - pows[i];
            if (subtraction == 0) {
                return true;
            }
            if (subtraction > 0) {
                n = subtraction;
            }
        }
        return n == 0;
    }


}
