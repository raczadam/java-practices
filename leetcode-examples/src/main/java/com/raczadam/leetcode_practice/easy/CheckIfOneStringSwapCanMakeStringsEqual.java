package com.raczadam.leetcode_practice.easy;

import java.util.Arrays;

public class CheckIfOneStringSwapCanMakeStringsEqual {


    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        if (diff > 2) {
            return false;
        }
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }


}
