package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StoneRemovalGameTest {


    private final StoneRemovalGame stoneRemovalGame = new StoneRemovalGame();


    @ParameterizedTest
    @ValueSource(ints = {12})
    void aliceCanWin(int n) {
        assertTrue(stoneRemovalGame.canAliceWin(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {1})
    void aliceCantWin(int n) {
        assertFalse(stoneRemovalGame.canAliceWin(n));
    }


}
