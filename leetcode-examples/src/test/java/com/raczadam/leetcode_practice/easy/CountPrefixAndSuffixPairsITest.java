package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPrefixAndSuffixPairsITest {


    private final CountPrefixAndSuffixPairsI countPrefixAndSuffixPairsI = new CountPrefixAndSuffixPairsI();


    @Test
    void testCountPrefixSuffixPairsCaseOne() {
        String[] words = new String[]{"a", "aba", "ababa", "aa"};
        assertEquals(4, countPrefixAndSuffixPairsI.countPrefixSuffixPairs(words));
    }


    @Test
    void testCountPrefixSuffixPairsCaseTwo() {
        String[] words = new String[]{"pa", "papa", "ma", "mama"};
        assertEquals(2, countPrefixAndSuffixPairsI.countPrefixSuffixPairs(words));
    }


    @Test
    void testCountPrefixSuffixPairsCaseThree() {
        String[] words = new String[]{"abab", "ab"};
        assertEquals(0, countPrefixAndSuffixPairsI.countPrefixSuffixPairs(words));
    }


}
