package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingWordsWithAGivenPrefixTest {


    @Test
    void prefixCountCaseOne() {
        String[] input = new String[]{"pay", "attention", "practice", "attend"};
        assertEquals(2, new CountingWordsWithAGivenPrefix().prefixCount(input, "at"));
    }


    @Test
    void prefixCountCaseTwo() {
        String[] input = new String[]{"leetcode", "win", "loops", "success"};
        assertEquals(0, new CountingWordsWithAGivenPrefix().prefixCount(input, "code"));
    }


}
