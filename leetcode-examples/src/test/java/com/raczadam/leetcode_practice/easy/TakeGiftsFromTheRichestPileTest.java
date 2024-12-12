package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeGiftsFromTheRichestPileTest {

    private final TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();

    @Test
    void testpickGiftsCase1() {
        /*
        Input: gifts = [25,64,9,4,100], k = 4
        Output: 29
         */
        assertEquals(29, solution.pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }


    @Test
    void testpickGiftsCase2() {
        /*
        Input: gifts = [1,1,1,1], k = 4
        Output: 4
         */
        assertEquals(4, solution.pickGifts(new int[]{1, 1, 1, 1}, 4));
    }


}
