package com.example.pi;

import java.math.BigDecimal;

@FunctionalInterface
public interface PiCalculator {

    BigDecimal calculate(int n);

}
