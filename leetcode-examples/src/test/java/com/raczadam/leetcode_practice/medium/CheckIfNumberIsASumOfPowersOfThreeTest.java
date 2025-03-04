package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfNumberIsASumOfPowersOfThreeTest {


    private final CheckIfNumberIsASumOfPowersOfThree instance = new CheckIfNumberIsASumOfPowersOfThree();


    static Stream<Object[]> sourceForCheckPowersOfThree() {
        return Stream.of(new Object[]{91, true}, new Object[]{12, true}, new Object[]{21, false});
    }


    @ParameterizedTest
    @MethodSource("sourceForCheckPowersOfThree")
    void testCheckPowersOfThree(int input, boolean result) {
        assertEquals(result, instance.checkPowersOfThree(input));
    }


}
