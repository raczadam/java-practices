package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NeighboringBitwiseXORTest {


    private final NeighboringBitwiseXOR neighboringBitwiseXOR = new NeighboringBitwiseXOR();


    @Test
    void testDoesValidArrayExistCaseOne() {
        assertTrue(neighboringBitwiseXOR.doesValidArrayExist(new int[]{1, 1, 0}));
    }


    @Test
    void testDoesValidArrayExistCaseTwo() {
        assertTrue(neighboringBitwiseXOR.doesValidArrayExist(new int[]{1, 1}));
    }


    @Test
    void testDoesValidArrayExistCaseThree() {
        // xor operation is associative, thus those two should be both false
        assertFalse(neighboringBitwiseXOR.doesValidArrayExist(new int[]{1, 0}));
        assertFalse(neighboringBitwiseXOR.doesValidArrayExist(new int[]{0, 1}));
    }


}
