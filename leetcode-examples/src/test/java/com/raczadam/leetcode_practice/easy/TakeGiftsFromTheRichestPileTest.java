package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeGiftsFromTheRichestPileTest {

    private final TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();

    @Test
    void testPickGiftsCase1() {
        /*
        Input: gifts = [25,64,9,4,100], k = 4
        Output: 29
         */
        assertEquals(29, solution.pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }


    @Test
    void testPickGiftsCase2() {
        /*
        Input: gifts = [1,1,1,1], k = 4
        Output: 4
         */
        assertEquals(4, solution.pickGifts(new int[]{1, 1, 1, 1}, 4));
    }


    @Test
    void testPickGiftsCase3() {
        /*
        Input: gifts = [56,41,27,71,62,57,67,34,8,71,2,12,52,1,64,43,32,42,9,25,73,29,31], k = 52
        Output: 4
         */
        assertEquals(32, solution.pickGifts(new int[]{56, 41, 27, 71, 62, 57, 67, 34, 8, 71, 2, 12, 52, 1, 64, 43, 32, 42, 9, 25, 73, 29, 31}, 52));
    }


}
