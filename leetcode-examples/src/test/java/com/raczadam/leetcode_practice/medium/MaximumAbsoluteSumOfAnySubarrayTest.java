package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAbsoluteSumOfAnySubarrayTest {


    private final MaximumAbsoluteSumOfAnySubarray instance = new MaximumAbsoluteSumOfAnySubarray();


    @Test
    void maxAbsoluteSumCaseOne() {
        assertEquals(5, instance.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4}));
    }


    @Test
    void maxAbsoluteSumCaseTwo() {
        assertEquals(8, instance.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2}));
    }


}
