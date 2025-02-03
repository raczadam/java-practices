package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {


    private final LongestStrictlyIncreasingOrStrictlyDecreasingSubarray example =
            new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();


    @Test
    void testLongestMonotonicSubArray() {
        Map<Integer, int[]> data = Map.of(2, new int[]{1, 4, 3, 3, 2},
                1, new int[]{3, 3, 3, 3},
                3, new int[]{3, 2, 1});
        data.forEach((k, v) -> assertEquals(k, example.longestMonotonicSubArray(v)));
    }


}
