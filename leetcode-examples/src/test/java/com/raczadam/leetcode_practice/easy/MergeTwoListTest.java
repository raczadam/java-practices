package com.raczadam.leetcode_practice.easy;


import com.raczadam.leetcode_practice.IntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoListTest {


    private final MergeTwoList mergeTwoList = new MergeTwoList();


    @ParameterizedTest
    @CsvSource(value = {"'0,2,3,4'", "'1,2,3,4'", "'0'"})
    void test_arrayToListNode(@ConvertWith(IntArrayConverter.class) int[] array) {
        ListNode resultNode = mergeTwoList.arrayToListNode(array);
        assertArrayEquals(array, mergeTwoList.nodeToArray(resultNode));
    }


    @Test
    void test_arrayToListNode_emptyArrayGiven() {
        int[] array = new int[0];
        ListNode resultNode = mergeTwoList.arrayToListNode(array);
        assertArrayEquals(array, mergeTwoList.nodeToArray(resultNode));
    }


    @Test
    void test_mergeTwoList() {
        ListNode listNode1 = mergeTwoList.arrayToListNode(new int[]{1, 1, 2, 3, 4});
        ListNode listNode2 = mergeTwoList.arrayToListNode(new int[]{1, 2, 3, 5});
        int[] expected = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 5};
        ListNode result = mergeTwoList.mergeTwoLists(listNode1, listNode2);
        assertArrayEquals(expected, mergeTwoList.nodeToArray(result));
    }


}
