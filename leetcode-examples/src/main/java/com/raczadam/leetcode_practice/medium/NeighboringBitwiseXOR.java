package com.raczadam.leetcode_practice.medium;

public class NeighboringBitwiseXOR {


    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int j : derived) {
            xor ^= j;
        }
        return xor == 0;
    }


}
