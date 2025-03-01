package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ApplyOperationsToAnArrayTest {


    private final ApplyOperationsToAnArray instance = new ApplyOperationsToAnArray();


    static Stream<Object[]> sourceForApplyOperations() {
        return Stream.of(
                new Object[]{new int[]{1, 4, 2, 0, 0, 0}, new int[]{1, 2, 2, 1, 1, 0}},
                new Object[]{new int[]{1, 0}, new int[]{0, 1}},
                new Object[]{new int[]{1694, 399, 832, 1758, 412, 206, 272, 0, 0, 0, 0, 0, 0, 0},
                        new int[]{847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272}}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceForApplyOperations")
    void testApplyOperations(int[] expected, int[] input) {
        assertArrayEquals(expected, instance.applyOperations(input));
    }


}
