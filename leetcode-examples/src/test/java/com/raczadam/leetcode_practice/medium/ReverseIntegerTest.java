package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {


    private final ReverseInteger reverseInteger = new ReverseInteger();


    static Stream<Object[]> sourceForTestReserve() {
        return Stream.of(
                new Object[]{123, 321},
                new Object[]{-123, -321},
                new Object[]{120, 21},
                new Object[]{1_000_000_009, 0}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceForTestReserve")
    void testReverse(int input, int number) {
        assertEquals(number, reverseInteger.reverse(input),
                () -> "Expected value for input " + input + " should be " + number);
    }


}
