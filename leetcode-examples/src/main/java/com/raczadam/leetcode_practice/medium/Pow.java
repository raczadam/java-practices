package com.raczadam.leetcode_practice.medium;

import java.math.BigDecimal;
import java.math.RoundingMode;

// https://leetcode.com/problems/powx-n/description/
public class Pow {


    public double myPow(double x, int n) {
        return BigDecimal
                .valueOf(Math.pow(x, n))
                .setScale(5, RoundingMode.HALF_UP).doubleValue();
    }


}
