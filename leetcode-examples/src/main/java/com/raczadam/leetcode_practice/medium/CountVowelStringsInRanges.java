package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-vowel-strings-in-ranges/description/?envType=daily-question&envId=2025-01-02
public class CountVowelStringsInRanges {


    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Boolean> correctVowels = Arrays.stream(words).map(this::isFirstAndLastCharVowel).toList();
        return Arrays
                .stream(queries)
                .map(query -> getNumberOfCorrectVowelStrings(correctVowels, query[0], query[1]))
                .mapToInt(Integer::intValue).toArray();
    }


    private boolean isFirstAndLastCharVowel(String string) {
        return VOWELS.contains(string.charAt(0))
                && VOWELS.contains(string.charAt(string.length() - 1));
    }


    private int getNumberOfCorrectVowelStrings(List<Boolean> stringIndexes, int startIndex, int endIndex) {
        int count = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if(stringIndexes.get(i)){
                count++;
            }
        }
        return count;
    }


}
