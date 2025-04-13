package com.raczadam.leetcode_practice.easy;

public class ValidPalindrome {


    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.contentEquals(new StringBuilder(s).reverse());
    }

}
