package com.example.pi;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChudnovskyAlgorithm implements PiCalculator {


    @Override
    public BigDecimal calculate(int n) {
        return chudnovsky(n);
    }

    /*
    def binary_split(a, b):
        if b == a + 1:
            Pab = -(6*a - 5)*(2*a - 1)*(6*a - 1)
            Qab = 10939058860032000 * a**3
            Rab = Pab * (545140134*a + 13591409)
        else:
            m = (a + b) // 2
            Pam, Qam, Ram = binary_split(a, m)
            Pmb, Qmb, Rmb = binary_split(m, b)

            Pab = Pam * Pmb
            Qab = Qam * Qmb
            Rab = Qmb * Ram + Pam * Rmb
        return Pab, Qab, Rab
     */

    private Triplet binarySplit(double a, double b) {
        BigDecimal pAb, qAb, rAb;
        if (b == a + 1) {
            pAb = BigDecimal.valueOf(-(6L * a - 5) * (2L * a - 1) * (6L * a - 1));
            qAb = BigDecimal.valueOf(10939058860032000L).multiply(BigDecimal.valueOf(Math.pow(a, 3)));
            rAb = pAb.multiply(BigDecimal.valueOf(545140134 * a + 13591409));
        } else {
            double m = (a + b) / 2;
            Triplet amTriplet = binarySplit(a, m);
            Triplet mbTriplet = binarySplit(m, b);
            pAb = amTriplet.p1n.multiply(mbTriplet.p1n);
            qAb = amTriplet.q1n.multiply(mbTriplet.q1n);
            BigDecimal qmbRam = amTriplet.r1n.multiply(mbTriplet.q1n);
            BigDecimal pamRmb = amTriplet.p1n.multiply(mbTriplet.r1n);
            rAb = qmbRam.add(pamRmb);
        }
        return new Triplet(pAb, qAb, rAb);
    }

    /*
    def chudnovsky(n):
        """Chudnovsky algorithm."""
        P1n, Q1n, R1n = binary_split(1, n)
        return (426880 * decimal.Decimal(10005).sqrt() * Q1n) / (13591409*Q1n + R1n)
     */

    public BigDecimal chudnovsky(int n) {
        Triplet triplet = binarySplit(1, n);
        BigDecimal left = BigDecimal.valueOf(426880).multiply(BigDecimal.valueOf(Math.sqrt(10005)).multiply(triplet.q1n));
        BigDecimal right = BigDecimal.valueOf(13591409).multiply(triplet.q1n).add(triplet.r1n);
        return left.divide(right, RoundingMode.CEILING);
    }

    private static final class Triplet {

        private final BigDecimal p1n;
        private final BigDecimal q1n;
        private final BigDecimal r1n;

        public Triplet(BigDecimal p1n, BigDecimal q1n, BigDecimal r1n) {
            this.p1n = p1n;
            this.q1n = q1n;
            this.r1n = r1n;
        }
    }

}
