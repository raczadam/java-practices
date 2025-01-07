package com.raczadam.leetcode_practice.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString {


    public String reverseWords(String s) {
        return Arrays
                .asList(s.split(" "))
                .reversed()
                .stream()
                .filter(string -> string.matches(".*\\w.*"))
                .collect(Collectors.joining(" "));
    }


}
