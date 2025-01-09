package com.raczadam.leetcode_practice.easy;

import java.util.Arrays;

// https://leetcode.com/problems/counting-words-with-a-given-prefix/?envType=daily-question&envId=2025-01-09
public class CountingWordsWithAGivenPrefix {


    public int prefixCount(String[] words, String pref) {
        return (int)Arrays.stream(words).filter(s -> s.startsWith(pref)).count();
    }


}
