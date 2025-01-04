package com.example;

import com.example.utility.MathUtils;

import java.util.Arrays;

/*
https://hu.wikipedia.org/wiki/Permut%C3%A1ci%C3%B3
https://www.geeksforgeeks.org/different-ways-to-generate-permutations-of-an-array/
 */
public class Permutation {

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }

    public static int[][] permute(int[] arr){
        int len = arr.length;
        if(len > 12){
            // from 13, the factorial value will be larger than the max value of integer
            throw new IllegalArgumentException("Array size too large: " + len);
        }

        int numberOfPermutations = (int)MathUtils.factorial(len);
        int[][] permutations = new int[numberOfPermutations][len];
        System.out.println(Arrays.deepToString(permutations));

        for (int i = 0; i < len - 1; i++) {

        }

        return null;
    }

}
