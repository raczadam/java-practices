package com.raczadam.leetcode_practice.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntUtilTest {


    @Test
    void test_reduceAndSortTwoDimensionalArray() {
        int[][] base = new int[][]{{1, 2, 3}, {1, 2, 3}, {0, 1, 2, 3, 4}};
        int[] expected = new int[]{0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4};
        assertArrayEquals(expected, IntUtil.reduceAndSortTwoDimensionalArray(base));
    }

}
