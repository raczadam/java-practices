package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueLength3PalindromicSubsequencesTest {


    @ParameterizedTest
    @MethodSource("sourceForTestCountPalindromicSubsequence")
    void testCountPalindromicSubsequence(String input, int number) {
        assertEquals(number, new UniqueLength3PalindromicSubsequences().countPalindromicSubsequence(input),
                () -> "Expected number of palindromes '" + input + "' should be " + number);
    }

    static Stream<Object[]> sourceForTestCountPalindromicSubsequence() {
        return Stream.of(
                new Object[]{"aabca", 3},
                new Object[]{"adc", 0},
                new Object[]{"bbcbaba", 4}
        );
    }

}