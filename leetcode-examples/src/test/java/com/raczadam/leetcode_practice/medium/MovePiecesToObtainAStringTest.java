package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MovePiecesToObtainAStringTest {


    private final MovePiecesToObtainAString movePiecesToObtainAString = new MovePiecesToObtainAString();

    @ParameterizedTest
    @CsvSource(value = {"'_L__R__R_','L______RR'", "'_LR____R_','L______RR'"})
    void canChange(String start, String target) {
        assertTrue(movePiecesToObtainAString.canChange(start, target));
    }


    @ParameterizedTest
    @CsvSource(value = {"'R_L_','__LR'", "'_R','R_'"})
    void cantChange(String start, String target) {
        assertFalse(movePiecesToObtainAString.canChange(start, target));
    }


}
