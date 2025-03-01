package com.raczadam.leetcode_practice.hard;

// https://leetcode.com/problems/shortest-common-supersequence/submissions/1559201182/?envType=daily-question&envId=2025-02-28
public class ShortestCommonSupersequence {


    public static void main(String[] args) {
        ShortestCommonSupersequence instance = new ShortestCommonSupersequence();

//        System.out.println(instance.longestCommonSubsequenceString("abcde", "ace"));
//        System.out.println(instance.longestCommonSubsequenceString("abc", "abc"));
//        System.out.println(instance.longestCommonSubsequenceString("abc", "def"));
//        System.out.println(instance.longestCommonSubsequenceString("abac", "cab"));
//        System.out.println(instance.longestCommonSubsequenceString("aaaaaaaa", "aaaaaaaa"));
//        System.out.println(instance.longestCommonSubsequenceString("bbbaaaba", "bbababbb"));


//        System.out.println(instance.shortestCommonSupersequence("abcde", "ace"));
//        System.out.println(instance.shortestCommonSupersequence("abc", "abc"));
//        System.out.println(instance.shortestCommonSupersequence("abc", "def"));
//        System.out.println(instance.shortestCommonSupersequence("abac", "cab"));
//        System.out.println(instance.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"));
//        System.out.println(instance.shortestCommonSupersequence("bbbaaaba", "bbababbb"));
        System.out.println(instance.shortestCommonSupersequence("bcacaaab", "bbabaccc"));
    }


    public String shortestCommonSupersequence(String str1, String str2) {
        StringBuilder builder = new StringBuilder();
        int i = str1.length();
        int j = str2.length();
        int[][] lengthsTable = longestCommonSubsequenceLengthsTable(str1, str2);

        char[] text1Arr = str1.toCharArray();
        char[] text2Arr = str2.toCharArray();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                builder.append(str1.charAt(i - 1));
                text1Arr[i - 1] = '-';
                text2Arr[j - 1] = '-';
                i--;
                j--;
            } else if (lengthsTable[i - 1][j] > lengthsTable[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        String commonSubSequence = builder.reverse().toString();
        boolean startFirst = text1Arr[0] != '-';

        System.out.println(new String(text1Arr));
        System.out.println(new String(text2Arr));
        System.out.println(commonSubSequence);

        String subtext1 = new String(text1Arr).replace("-", "");
        String subtext2 = new String(text2Arr).replace("-", "");
        char[] arr;
        String end;
        if (startFirst) {
            arr = text1Arr;
            end = subtext2;
        } else {
            arr = text2Arr;
            end = subtext1;
        }
        int counter = 0;
        char[] arr2 = new char[arr.length];

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == '-') {
                char next = commonSubSequence.charAt(counter);
                // System.out.println(next);
                arr2[k] = next;
                counter++;
                //System.out.println(Arrays.toString(arr2));
            } else {
                arr2[k] = arr[k];
            }
        }
        //  System.out.println(Arrays.toString(arr2));
        return new String(arr2) + end;
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
