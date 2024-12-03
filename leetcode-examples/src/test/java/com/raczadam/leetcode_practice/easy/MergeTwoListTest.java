package com.raczadam.leetcode_practice.easy;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoListTest {

    private final MergeTwoList mergeTwoList = new MergeTwoList();

    private static class IntArrayConverter implements ArgumentConverter {

        @Override
        public Object convert(Object source, ParameterContext context)
                throws ArgumentConversionException {
            if (!(source instanceof String)) {
                throw new IllegalArgumentException(
                        "The argument should be a string: " + source);
            }
            try {
                return Arrays.stream(((String) source).split(",")).mapToInt(Integer::parseInt).toArray();
            } catch (Exception e) {
                e.printStackTrace();
                throw new IllegalArgumentException("Failed to convert", e);
            }
        }

    }

    @ParameterizedTest
    @CsvSource(value = {"'0,2,3,4'", "'1,2,3,4'", "'0'"})
    void test_arrayToListNode(@ConvertWith(IntArrayConverter.class) int[] array) {
        MergeTwoList.ListNode resultNode = mergeTwoList.arrayToListNode(array);
        assertArrayEquals(array, mergeTwoList.nodeToArray(resultNode));
    }


    @Test
    void test_arrayToListNode_emptyArrayGiven() {
        int[] array = new int[0];
        MergeTwoList.ListNode resultNode = mergeTwoList.arrayToListNode(array);
        assertArrayEquals(array, mergeTwoList.nodeToArray(resultNode));
    }


    @Test
    void test_mergeTwoList() {
        MergeTwoList.ListNode listNode1 = mergeTwoList.arrayToListNode(new int[]{1, 1, 2, 3, 4});
        MergeTwoList.ListNode listNode2 = mergeTwoList.arrayToListNode(new int[]{1, 2, 3, 5});
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 5};
        MergeTwoList.ListNode result = mergeTwoList.mergeTwoLists(listNode1, listNode2);
        assertArrayEquals(expected, mergeTwoList.nodeToArray(result));
    }


}
