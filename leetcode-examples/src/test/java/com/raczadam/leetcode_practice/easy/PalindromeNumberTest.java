package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {


    private final PalindromeNumber palindromeNumber = new PalindromeNumber();


    @ParameterizedTest
    @ValueSource(ints = {121})
    void isPalindrome(int input) {
        assertTrue(palindromeNumber.isPalindrome(input));
    }


    @ParameterizedTest
    @ValueSource(ints = {-121, 10})
    void isNotPalindrome(int input) {
        assertFalse(palindromeNumber.isPalindrome(input));
    }


}
