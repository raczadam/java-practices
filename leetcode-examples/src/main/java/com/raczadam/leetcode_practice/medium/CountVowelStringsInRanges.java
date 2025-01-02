package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-vowel-strings-in-ranges/description/?envType=daily-question&envId=2025-01-02
public class CountVowelStringsInRanges {


    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] stringsIndexes = getPreCounted(words);
        return Arrays
                .stream(queries)
                .map(query -> getNumberOfCorrectVowelStrings(stringsIndexes, query[0], query[1]))
                .mapToInt(Integer::intValue).toArray();
    }

    private int[] getPreCounted(String[] words) {
        int length = words.length;
        int[] preCounted = new int[length];

        for (int i = 0; i < length; i++) {
            if (isFirstAndLastCharVowel(words[i])) {
                preCounted[i]++;
            }
        }
        for (int i = 1; i < length; i++) {
            preCounted[i] += preCounted[i - 1];
        }
        return preCounted;
    }

    private boolean isFirstAndLastCharVowel(String string) {
        return VOWELS.contains(string.charAt(0)) && VOWELS.contains(string.charAt(string.length() - 1));
    }

    private int getNumberOfCorrectVowelStrings(int[] stringIndexes, int queryStartIndex, int queryEndIndex) {
        if (queryStartIndex == 0) {
            return stringIndexes[queryEndIndex];
        } else {
            return stringIndexes[queryEndIndex] - stringIndexes[queryStartIndex - 1];
        }
    }


}
