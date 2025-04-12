package com.example.pi;

public class RiemannZeta implements PiCalculator {

    // not so accurate, even if the value of n is high
    // e.g. 100.000.000
    @Override
    public double calculate(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1 / Math.pow(i, 2));
        }
        return Math.sqrt(result * 6);
    }

}
