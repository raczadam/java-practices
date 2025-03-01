package com.raczadam.leetcode_practice.hard;

public class ShortestCommonSupersequence {


    public static void main(String[] args) {
        ShortestCommonSupersequence instance = new ShortestCommonSupersequence();

        System.out.println(instance.longestCommonSubsequenceString("abcde", "ace"));
        System.out.println(instance.longestCommonSubsequenceString("abc", "abc"));
        System.out.println(instance.longestCommonSubsequenceString("abc", "def"));
        System.out.println(instance.longestCommonSubsequenceString("abac", "cab"));
        System.out.println(instance.longestCommonSubsequenceString("aaaaaaaa", "aaaaaaaa"));


        System.out.println(instance.shortestCommonSupersequence("abcde", "ace"));
        System.out.println(instance.shortestCommonSupersequence("abc", "abc"));
        System.out.println(instance.shortestCommonSupersequence("abc", "def"));
        System.out.println(instance.shortestCommonSupersequence("abac", "cab"));
        System.out.println(instance.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"));
    }


    public String shortestCommonSupersequence(String str1, String str2) {
        String longestCommonSubSequenceString = longestCommonSubsequenceString(str1, str2);
        String modifiedFirst = str1.replace(longestCommonSubSequenceString, "");
        String modifiedSecond = str2.replace(longestCommonSubSequenceString, "");
        if (modifiedFirst.length() > modifiedSecond.length()) {
            return modifiedSecond + longestCommonSubSequenceString + modifiedFirst;
        } else {
            return modifiedFirst + longestCommonSubSequenceString + modifiedSecond;
        }
    }


    private String longestCommonSubsequenceString(String text1, String text2) {
        StringBuilder builder = new StringBuilder();
        int i = text1.length();
        int j = text2.length();
        int[][] lengthsTable = longestCommonSubsequenceLengthsTable(text1, text2);
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                builder.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (lengthsTable[i - 1][j] > lengthsTable[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return builder.reverse().toString();
    }


    public int[][] longestCommonSubsequenceLengthsTable(String text1, String text2) {
        int text1Length = text1.length();
        int text2Length = text2.length();
        int[][] table = new int[text1Length + 1][text2Length + 1];
        for (int i = 1; i <= text1Length; i++) {
            for (int j = 1; j <= text2Length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    table[i][j] = 1 + table[i - 1][j - 1];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
        return table;
    }


}
