package com.raczadam.leetcode_practice.medium;

import java.util.*;

// https://leetcode.com/problems/word-subsets/description/
public class WordSubsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> resultList = new ArrayList<>();
        List<int[]> wordOccurrences = Arrays.stream(words1).map(this::countOccurrences).toList();
        List<int[]> subOccurrences = Arrays.stream(words2).map(this::countOccurrences).toList();

        int[] maxSubOccurrences = new int[26];
        Arrays.fill(maxSubOccurrences, 0);
        for (int[] occurrence : subOccurrences) {
            for (int i = 0; i < occurrence.length; i++) {
                maxSubOccurrences[i] = Math.max(occurrence[i], maxSubOccurrences[i]);
            }
        }

        int counter = 0;
        for (int[] occurrence : wordOccurrences) {
            if (isUniversal(occurrence, maxSubOccurrences)) {
                resultList.add(words1[counter]);
            }
            counter++;
        }

        return resultList;
    }

    private boolean isUniversal(int[] arr, int[] maxSubOccurrences) {
        for (int i = 0; i < arr.length; i++) {
            if (maxSubOccurrences[i] > arr[i]) {
                return false;
            }
        }
        return true;
    }


    private int[] countOccurrences(String word) {
        int[] result = new int[26];
        Arrays.fill(result, 0);
        for (char character : word.toCharArray()) {
            result[character - 'a']++;
        }
        return result;
    }


}
