package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {


    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();


    @Test
    void testLongestCommonPrefixCaseOne() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
    }


    @Test
    void testLongestCommonPrefixCaseTwo() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String expected = "";
        assertEquals(expected, longestCommonPrefix.longestCommonPrefix(input));
    }


}
