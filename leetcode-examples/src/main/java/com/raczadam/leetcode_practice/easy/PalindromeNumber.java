package com.raczadam.leetcode_practice.easy;

public class PalindromeNumber {


    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        return s.contentEquals(new StringBuilder(s).reverse());
    }

}
