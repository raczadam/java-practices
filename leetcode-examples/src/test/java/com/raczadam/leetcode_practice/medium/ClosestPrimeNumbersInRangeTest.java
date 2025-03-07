package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClosestPrimeNumbersInRangeTest {


    private final ClosestPrimeNumbersInRange instance = new ClosestPrimeNumbersInRange();


    static Stream<Object[]> sourceForClosestPrimes() {
        return Stream.of(new Object[]{new int[]{11, 13}, 10, 19},
                new Object[]{new int[]{-1, -1}, 4, 6},
                new Object[]{new int[]{-1, -1}, 1, 2});
    }


    @ParameterizedTest
    @MethodSource(value = "sourceForClosestPrimes")
    void testClosestPrimes(int[] expected, int left, int right) {
        assertArrayEquals(expected, instance.closestPrimes(left, right));
    }


}
