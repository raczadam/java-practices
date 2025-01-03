package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfWaysToSplitArrayTest {


    @Test
    void waysToSplitArrayCaseOne() {
        /*
        Input: nums = [10,4,-8,7]
        Output: 2
         */
        int[] input = new int[]{10, 4, -8, 7};
        assertEquals(2, new NumberOfWaysToSplitArray().waysToSplitArray(input));
    }


    @Test
    void waysToSplitArrayCaseTwo() {
        /*
        Input: nums = [2,3,1,0]
        Output: 2
         */
        int[] input = new int[]{2, 3, 1, 0};
        assertEquals(2, new NumberOfWaysToSplitArray().waysToSplitArray(input));
    }


}
