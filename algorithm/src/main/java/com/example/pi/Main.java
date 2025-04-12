package com.example.pi;


import java.util.Date;
import java.util.List;

public class Main {

    private static final List<PiCalculator> calculators = List.of(new RiemannZeta());

    public static void main(String[] args) {
        final int n = 100_000_000;
        System.out.println("PI value, according to JVM: " + Math.PI);

        calculate(new RiemannZeta(), n);
    }

    private static void calculate(PiCalculator calculator, int n) {
        Date startTime = new Date();
        System.out.println("Calculate PI. Algorithm: " + calculator.getClass().getSimpleName() + ", n=" + n + ", startTime: " + startTime);
        calculator.calculate(n);
        Date endTime = new Date();
        System.out.println("Calculation has ended. Time: " + endTime + ", time elapsed: " + (endTime.getTime() - startTime.getTime()) + " ms");
    }

}
