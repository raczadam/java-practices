package com.raczadam.leetcode_practice.medium;

public class BitwiseXOROfAllPairings {


    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        if (nums2.length % 2 != 0) {
            for (int j : nums1) {
                xor1 ^= j;
            }
        }

        if (nums1.length % 2 != 0) {
            for (int j : nums2) {
                xor2 ^= j;
            }
        }
        return xor1 ^ xor2;
    }


}
