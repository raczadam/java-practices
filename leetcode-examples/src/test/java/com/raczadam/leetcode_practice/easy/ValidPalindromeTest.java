package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {


    private final ValidPalindrome obj = new ValidPalindrome();


    @ParameterizedTest
    @ValueSource(strings = {"Abba", "bAB", "A man, a plan, a canal: Panama", "2002", "2aba2"})
    void isPalindromeShouldBeTrue(String s) {
        assertTrue(obj.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0P", "123", "I am Batman"})
    void isPalindromeShouldBeFalse(String s) {
        assertFalse(obj.isPalindrome(s));
    }

}
