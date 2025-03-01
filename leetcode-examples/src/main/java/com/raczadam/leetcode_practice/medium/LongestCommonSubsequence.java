package com.raczadam.leetcode_practice.medium;

// https://leetcode.com/problems/longest-common-subsequence/submissions/1559086287/
public class LongestCommonSubsequence {


    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] lengths = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lengths[i][j] = 1 + lengths[i - 1][j - 1];
                } else {
                    lengths[i][j] = Math.max(lengths[i - 1][j], lengths[i][j - 1]);
                }
            }
        }
        return lengths[n][m];
    }


}
