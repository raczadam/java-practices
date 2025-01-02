package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountVowelStringsInRangesTest {

    private final CountVowelStringsInRanges countVowelStringsInRanges = new CountVowelStringsInRanges();

    @Test
    void vowelStringsCaseOne() {
        /*
        Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
        Output: [2,3,0]
         */
        String[] words = new String[]{"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = new int[][]{{0, 2}, {1, 4}, {1, 1}};
        assertArrayEquals(new int[]{2, 3, 0}, countVowelStringsInRanges.vowelStrings(words, queries));
    }

    @Test
    void vowelStringsCaseTwo() {
        /*
        Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
        Output: [3,2,1]
         */
        String[] words = new String[]{"a", "e", "i"};
        int[][] queries = new int[][]{{0, 2}, {0, 1}, {2, 2}};
        assertArrayEquals(new int[]{3, 2, 1}, countVowelStringsInRanges.vowelStrings(words, queries));
    }

}
