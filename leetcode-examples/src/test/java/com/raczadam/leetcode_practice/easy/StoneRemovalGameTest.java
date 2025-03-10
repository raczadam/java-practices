package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StoneRemovalGameTest {


    private final StoneRemovalGame stoneRemovalGame = new StoneRemovalGame();


    @ParameterizedTest
    @ValueSource(ints = {10, 12, 13, 16, 18, 29, 30})
    void aliceCanWin(int n) {
        assertTrue(stoneRemovalGame.canAliceWin(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 21})
    void aliceCantWin(int n) {
        assertFalse(stoneRemovalGame.canAliceWin(n));
    }


}
