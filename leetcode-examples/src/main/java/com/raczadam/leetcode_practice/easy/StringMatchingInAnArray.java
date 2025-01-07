package com.raczadam.leetcode_practice.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {


    // first solution - use brute-force
    public List<String> stringMatching(String[] words) {
        Set<String> resultSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i && words[j].contains(words[i])) {
                    resultSet.add(words[i]);
                }
            }
        }
        return new ArrayList<>(resultSet);
    }


}
