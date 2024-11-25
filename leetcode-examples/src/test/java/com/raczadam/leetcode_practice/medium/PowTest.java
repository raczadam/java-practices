package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowTest {


    private final Pow pow = new Pow();


    @Test
    void myPowCaseOne() {
        /*
        Input: x = 2.00000, n = 10
        Output: 1024.00000
         */
        assertEquals(1024, pow.myPow(2.0, 10));
    }


    @Test
    void myPowCaseTwo() {
        /*
        Input: x = 2.10000, n = 3
        Output: 9.26100
         */
        assertEquals(9.26100, pow.myPow(2.1, 3));
    }


    @Test
    void myPowCaseThree() {
        /*
        Input: x = 2.00000, n = -2
        Output: 0.25000
         */
        assertEquals(0.25000, pow.myPow(2.00000, -2));
    }


}
