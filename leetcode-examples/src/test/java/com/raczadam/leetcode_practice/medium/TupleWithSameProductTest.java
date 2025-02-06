package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TupleWithSameProductTest {


    private final TupleWithSameProduct tupleWithSameProduct = new TupleWithSameProduct();


    static Stream<Object[]> sourceTupleSameProduct() {
        return Stream.of(
                new Object[]{8, new int[]{2, 3, 4, 6}},
                new Object[]{16, new int[]{1, 2, 4, 5, 10}},
                new Object[]{40, new int[]{2, 3, 4, 6, 8, 12}}
        );
    }


    @ParameterizedTest
    @MethodSource("sourceTupleSameProduct")
    void testTupleSameProduct(int expected, int[] input) {
        assertEquals(expected, tupleWithSameProduct.tupleSameProduct(input));
    }


}
