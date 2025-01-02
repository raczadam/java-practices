package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-vowel-strings-in-ranges/description/?envType=daily-question&envId=2025-01-02
public class CountVowelStringsInRanges {


    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Integer> stringsIndexes = stringIndexes(words);
        return Arrays
                .stream(queries)
                .map(query -> getNumberOfCorrectVowelStrings(stringsIndexes, query[0], query[1]))
                .mapToInt(Integer::intValue).toArray();
    }

    private List<Integer> stringIndexes(String[] words) {
        List<Integer> stringsIndexes = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isFirstAndLastCharVowel(words[i])) {
                stringsIndexes.add(i);
            }
        }
        return stringsIndexes;
    }

    private boolean isFirstAndLastCharVowel(String string) {
        return VOWELS.contains(string.charAt(0))
                && VOWELS.contains(string.charAt(string.length() - 1));
    }


    private int getNumberOfCorrectVowelStrings(List<Integer> stringIndexes, int queryStartIndex, int queryEndIndex) {
        // FIXME
        // at first, we should count the concrete value of queryStartIndex
        // (if stringIndexes list does not contain its value)
        // and the queryEndIndex.

        int startIndex = stringIndexes.get(queryStartIndex);
        int endIndex = stringIndexes.get(queryEndIndex);
        return endIndex - startIndex;
    }


}
