package com.raczadam.leetcode_practice.medium;

public class ReverseInteger {

    public int reverse(int x) {
        int finalMultiplier = x < 0 ? -1 : 1;
        String s = String.valueOf(Math.abs((long)x));
        int index;
        for (index = s.length() - 1; index > 0; index--) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        s = s.substring(0, index + 1);
        long result = Long.parseLong(new StringBuilder(s).reverse().toString());
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result * finalMultiplier;
    }

}
