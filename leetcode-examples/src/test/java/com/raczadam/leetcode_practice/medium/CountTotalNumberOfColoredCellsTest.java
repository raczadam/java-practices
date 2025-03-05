package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTotalNumberOfColoredCellsTest {


    private final CountTotalNumberOfColoredCells instance = new CountTotalNumberOfColoredCells();


    static Stream<Object[]> sourceForColoredCells() {
        return Stream.of(new Object[]{1, 1}, new Object[]{2, 5}, new Object[]{3, 13});
    }


    @ParameterizedTest
    @MethodSource("sourceForColoredCells")
    void testColoredCells(int input, int expected) {
        assertEquals(expected, instance.coloredCells(input));
    }


}
