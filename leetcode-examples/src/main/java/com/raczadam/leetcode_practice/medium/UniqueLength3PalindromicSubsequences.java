package com.raczadam.leetcode_practice.medium;

import java.util.*;

// https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-01-04
public class UniqueLength3PalindromicSubsequences {

    public int countPalindromicSubsequence(String s) {
        int len = s.length();
        Map<Character, int[]> occurrences = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char key = s.charAt(i);
            if (!occurrences.containsKey(key)) {
                occurrences.put(key, new int[]{i, i});
            } else {
                occurrences.get(key)[1] = i;
            }
        }

        int count = 0;
        for (Map.Entry<Character, int[]> entry : occurrences.entrySet()) {
            int[] indexes = entry.getValue();
            if (indexes[0] < indexes[1]) {
                String sub = s.substring(indexes[0] + 1, indexes[1]);
                Set<Character> uniqueChars = new LinkedHashSet<>();
                for (char c : sub.toCharArray()) {
                    uniqueChars.add(c);
                }
                count += uniqueChars.size();
            }
        }

        return count;
    }

}
