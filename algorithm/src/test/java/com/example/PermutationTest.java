package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationTest {


    @Test
    void testPermute() {
        /*
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        */
        int[] input = new int[]{1, 2, 3};
        int[][] output = new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        assertTrue(Arrays.deepEquals(output, Permutation.permute(input)));
    }

}
