package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAscendingSubarraySumTest {


    private final MaximumAscendingSubarraySum example = new MaximumAscendingSubarraySum();


    static Stream<Object[]> sourceMaxAscendingSum() {
        return Stream.of(
                new Object[]{65, new int[]{10, 20, 30, 5, 10, 50}},
                new Object[]{150, new int[]{10, 20, 30, 40, 50}},
                new Object[]{33, new int[]{12, 17, 15, 13, 10, 11, 12}}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceMaxAscendingSum")
    void testMaxAscendingSum(int expected, int[] data) {
        assertEquals(expected, example.maxAscendingSum((data)));
    }


}
