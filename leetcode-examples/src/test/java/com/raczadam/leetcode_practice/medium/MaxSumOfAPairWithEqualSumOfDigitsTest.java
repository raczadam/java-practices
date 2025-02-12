package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfAPairWithEqualSumOfDigitsTest {


    private final MaxSumOfAPairWithEqualSumOfDigits obj = new MaxSumOfAPairWithEqualSumOfDigits();


    @Test
    void testMaximumSumCaseOne() {
        assertEquals(54, obj.maximumSum(new int[]{18, 43, 36, 13, 7}));
    }


    @Test
    void testMaximumSumCaseTwo() {
        assertEquals(-1, obj.maximumSum(new int[]{10, 12, 19, 14}));
    }


}
