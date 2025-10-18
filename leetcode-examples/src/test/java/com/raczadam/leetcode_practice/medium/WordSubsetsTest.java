package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WordSubsetsTest {


    private final WordSubsets wordSubsets = new WordSubsets();


    @Test
    void testWordSubsetsCaseOne() {
        String[][] input = new String[][]{{"amazon", "apple", "facebook", "google", "leetcode"}, {"e", "o"}};
        List<String> expected = Arrays.asList("facebook", "google", "leetcode");
        List<String> result = wordSubsets.wordSubsets(input[0], input[1]);
        assertThat(result).hasSameElementsAs(expected);
    }

    @Test
    void testWordSubsetsCaseTwo() {
        String[][] input = new String[][]{{"amazon", "apple", "facebook", "google", "leetcode"}, {"lc", "eo"}};
        List<String> expected = List.of("leetcode");
        List<String> result = wordSubsets.wordSubsets(input[0], input[1]);
        assertThat(result).hasSameElementsAs(expected);
    }

    @Test
    void testWordSubsetsCaseThree() {
        String[][] input = new String[][]{{"acaac", "cccbb", "aacbb", "caacc", "bcbbb"}, {"c", "cc", "b"}};
        List<String> expected = List.of("cccbb");
        List<String> result = wordSubsets.wordSubsets(input[0], input[1]);
        assertThat(result).hasSameElementsAs(expected);
    }

    @Test
    void testWordSubsetsCaseFour() {
        String[][] input = new String[][]{{"amazon", "apple", "facebook", "google", "leetcode"}, {"lo", "eo"}};
        List<String> expected = List.of("google", "leetcode");
        List<String> result = wordSubsets.wordSubsets(input[0], input[1]);
        assertThat(result).hasSameElementsAs(expected);
    }

}
