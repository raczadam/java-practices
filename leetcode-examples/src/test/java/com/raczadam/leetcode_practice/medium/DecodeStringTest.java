package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeStringTest {


    private final DecodeString decodeString = new DecodeString();

    static Stream<Object[]> sourceForTestDecodeString() {
        return Stream.of(
                new Object[]{"3[a]2[bc]", "aaabcbc"},
                new Object[]{"3[a2[c]]", "accaccacc"},
                new Object[]{"2[abc]3[cd]ef", "abcabccdcdcdef"}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceForTestDecodeString")
    void testDecodeString(String input, String expected) {
        assertEquals(expected, decodeString.decodeString(input),
                () -> "Expected value for input " + input + " should be " + expected);
    }


}
