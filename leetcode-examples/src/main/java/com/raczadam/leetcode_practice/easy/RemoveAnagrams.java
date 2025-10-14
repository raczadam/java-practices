package com.raczadam.leetcode_practice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {

    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        char[] left;
        char[] right = new char[]{};
        for (int i = 1; i < words.length; i++) {
            if (i == 1) {
                left = words[i - 1].toCharArray();
                right = words[i].toCharArray();
                Arrays.sort(left);
            } else {
                left = right;
                right = words[i].toCharArray();
            }
            Arrays.sort(right);
            if (!Arrays.equals(left, right)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveAnagrams obj = new RemoveAnagrams();
        /*
        Input: words = ["abba","baba","bbaa","cd","cd"]
        Output: ["abba","cd"]
         */
        System.out.println(obj.removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));
    }

}
