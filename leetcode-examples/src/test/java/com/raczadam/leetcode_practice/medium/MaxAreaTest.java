package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaTest {


    private final MaxArea maxArea = new MaxArea();


    @Test
    void maxAreaCaseOne() {
        /*
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        */
        assertEquals(49, maxArea.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }


    @Test
    void maxAreaCaseTwo() {
        /*
        Input: height = [1,1]
        Output: 1
        */
        assertEquals(1, maxArea.maxArea(new int[]{1, 1}));
    }


}
