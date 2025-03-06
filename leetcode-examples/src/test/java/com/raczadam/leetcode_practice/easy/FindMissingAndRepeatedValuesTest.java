package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindMissingAndRepeatedValuesTest {


    private final FindMissingAndRepeatedValues instance = new FindMissingAndRepeatedValues();


    static Stream<Object[]> sourceForFindMissingAndRepeatedValues() {
        return Stream.of(new Object[]{new int[]{2, 4}, new int[][]{{1, 3}, {2, 2}}},
                new Object[]{new int[]{9, 5}, new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}});
    }


    @ParameterizedTest
    @MethodSource("sourceForFindMissingAndRepeatedValues")
    void testFindMissingAndRepeatedValues(int[] expected, int[][] input) {
        assertArrayEquals(expected, instance.findMissingAndRepeatedValues(input));
    }


}
