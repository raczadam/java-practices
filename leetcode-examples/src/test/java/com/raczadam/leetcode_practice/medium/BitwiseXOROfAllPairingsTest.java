package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseXOROfAllPairingsTest {


    private final BitwiseXOROfAllPairings bitwiseXOROfAllPairings = new BitwiseXOROfAllPairings();


    @Test
    void testXorAllNumsCaseOne() {
        assertEquals(13, bitwiseXOROfAllPairings.xorAllNums(new int[]{2, 1, 3}, new int[]{10, 2, 5, 0}));
    }


    @Test
    void testXorAllNumsCaseTwo() {
        assertEquals(0, bitwiseXOROfAllPairings.xorAllNums(new int[]{1, 2}, new int[]{3, 4}));
    }


}
