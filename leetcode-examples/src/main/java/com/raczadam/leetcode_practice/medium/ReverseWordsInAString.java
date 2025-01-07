package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;

public class ReverseWordsInAString {


    public String reverseWords(String s) {
        return String.join(" ", Arrays.asList(s.split("\\s+")).reversed()).trim();
    }


}
