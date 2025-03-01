package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {


    private final LongestCommonSubsequence instance = new LongestCommonSubsequence();


    static Stream<Object[]> sourceForLongestCommonSubsequence() {
        return Stream.of(
                new Object[]{3, "abcde", "ace"},
                new Object[]{3, "abc", "abc"},
                new Object[]{0, "abc", "def"}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceForLongestCommonSubsequence")
    void testLongestCommonSubsequence(int expected, String text1, String text2) {
        assertEquals(expected, instance.longestCommonSubsequence(text1, text2));
    }


}
