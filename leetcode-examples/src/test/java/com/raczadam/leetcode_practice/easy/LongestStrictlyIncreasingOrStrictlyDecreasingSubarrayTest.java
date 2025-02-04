package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {


    private final LongestStrictlyIncreasingOrStrictlyDecreasingSubarray example =
            new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();


    static Stream<Object[]> sourceLongestMonotonicSubArray() {
        return Stream.of(
                new Object[]{2, new int[]{1, 4, 3, 3, 2}},
                new Object[]{1, new int[]{3, 3, 3, 3}},
                new Object[]{3, new int[]{3, 2, 1}}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceLongestMonotonicSubArray")
    void testLongestMonotonicSubArray(int expected, int[] data) {
        assertEquals(expected, example.longestMonotonicSubArray(data));
    }


}
