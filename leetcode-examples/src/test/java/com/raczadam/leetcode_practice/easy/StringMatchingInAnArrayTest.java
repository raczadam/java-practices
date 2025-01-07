package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringMatchingInAnArrayTest {


    private final StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();


    @Test
    void stringMatchingCaseOne() {
        String[] input = new String[]{"mass", "as", "hero", "superhero"};
        List<String> expected = Arrays.asList("as", "hero");
        assertThat(stringMatchingInAnArray.stringMatching(input)).hasSameElementsAs(expected);
    }


    @Test
    void stringMatchingCaseTwo() {
        String[] input = new String[]{"leetcode", "et", "code"};
        List<String> expected = Arrays.asList("et", "code");
        assertThat(stringMatchingInAnArray.stringMatching(input)).hasSameElementsAs(expected);
    }


    @Test
    void stringMatchingCaseThree() {
        String[] input = new String[]{"blue", "green", "bu"};
        List<String> expected = new ArrayList<>();
        assertThat(stringMatchingInAnArray.stringMatching(input)).hasSameElementsAs(expected);
    }


}
