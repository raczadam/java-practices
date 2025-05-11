package com.example.pi;


import java.util.Date;
import java.util.List;

public class Main {

    private static final List<PiCalculator> calculators = List.of(new RiemannZeta());

    public static void main(String[] args) {
        System.out.println("*************************************************************");
        System.out.println("********************** PI calculations **********************");
        System.out.println("*************************************************************");
        System.out.println("PI value, according to JVM: " + Math.PI);
        System.out.println("*************************************************************");

        //calculate(new RiemannZeta(), 100_000_000);
        calculate(new ChudnovskyAlgorithm(), 2);
    }

    private static void calculate(PiCalculator calculator, int n) {
        Date startTime = new Date();
        System.out.println("Calculate PI. Algorithm: " + calculator.getClass().getSimpleName() + ", n=" + n + ", startTime: " + startTime);
        System.out.println("Calculated value: " + calculator.calculate(n));
        Date endTime = new Date();
        System.out.println("Calculation has ended. Time: " + endTime + ", time elapsed: " + (endTime.getTime() - startTime.getTime()) + " ms");
        System.out.println("*************************************************************");
    }

}
