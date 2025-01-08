package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SingleNumberIIITest {


    private final SingleNumberIII singleNumber = new SingleNumberIII();


    @Test
    void testSingleNumberCaseOne() {
        int[] input = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{3, 5};
        assertArrayEquals(expected, singleNumber.singleNumber(input));
    }


    @Test
    void testSingleNumberCaseTwo() {
        int[] input = new int[]{-1, 0};
        int[] expected = new int[]{-1, 0};
        assertArrayEquals(expected, singleNumber.singleNumber(input));
    }


    @Test
    void testSingleNumberCaseThree() {
        int[] input = new int[]{1, 0};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, singleNumber.singleNumber(input));
    }


    @Test
    void testSingleNumberCaseFour() {
        int[] input = new int[]{0, 1, 2, 2};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, singleNumber.singleNumber(input));
    }


}
