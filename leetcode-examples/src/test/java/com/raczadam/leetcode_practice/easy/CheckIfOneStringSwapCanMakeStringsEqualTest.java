package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfOneStringSwapCanMakeStringsEqualTest {


    private final CheckIfOneStringSwapCanMakeStringsEqual example = new CheckIfOneStringSwapCanMakeStringsEqual();


    static Stream<Object[]> sourceAreAlmostEqual() {
        return Stream.of(
                new Object[]{true, "bank", "kanb"},
                new Object[]{false, "attack", "defend"},
                new Object[]{true, "kelb", "kelb"}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceAreAlmostEqual")
    void testAreAlmostEqual(boolean expected, String s1, String s2) {
        assertEquals(expected, example.areAlmostEqual(s1, s2));
    }


}
