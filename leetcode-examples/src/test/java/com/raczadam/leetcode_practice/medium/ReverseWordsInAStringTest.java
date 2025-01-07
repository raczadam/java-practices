package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {


    private final ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();


    static Stream<Object[]> sourceForTestReserveWords() {
        return Stream.of(
                new Object[]{"the sky is blue", "blue is sky the"},
                new Object[]{"  hello world  ", "world hello"},
                new Object[]{"a good   example", "example good a"}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceForTestReserveWords")
    void testReverse(String input, String number) {
        assertEquals(number, reverseWordsInAString.reverseWords(input),
                () -> "Expected value for input " + input + " should be " + number);
    }


}
