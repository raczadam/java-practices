package com.example.pi;

import java.math.BigDecimal;

public class RiemannZeta implements PiCalculator {

    // not so accurate, even if the value of n is high
    // e.g. 100.000.000
    @Override
    public BigDecimal calculate(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1 / Math.pow(i, 2));
        }
        return BigDecimal.valueOf(Math.sqrt(result * 6));
    }

}
