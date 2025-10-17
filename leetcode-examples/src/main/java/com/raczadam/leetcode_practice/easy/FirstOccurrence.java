package com.raczadam.leetcode_practice.easy;

public class FirstOccurrence {

    public int strStr(String haystack, String needle) {
        // lazy solution
        return haystack.indexOf(needle);
    }


    public int strStrCustom(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
                int counter = 0;
                for (int j = 0; j < needle.length(); j++) {
                    if (needle.charAt(j) == haystack.charAt(i + counter)) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (counter == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        FirstOccurrence obj = new FirstOccurrence();

        System.out.println(obj.strStr("sadbutsad", "sad")); // expected: 0
        System.out.println(obj.strStr("leetcode", "leeto")); // expected: -1

        System.out.println(obj.strStrCustom("sadbutsad", "sad")); // expected: 0
        System.out.println(obj.strStrCustom("leetcode", "leeto")); // expected: -1
    }
}
