package com.raczadam.leetcode_practice.easy;

import java.util.Arrays;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean appendable = true;
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    appendable = false;
                    break;
                }
            }
            if (appendable) {
                result.append(currentChar);
            } else {
                break;
            }
        }
        return result.toString();
    }


}
