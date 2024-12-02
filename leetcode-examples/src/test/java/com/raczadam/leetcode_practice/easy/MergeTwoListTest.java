package com.raczadam.leetcode_practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoListTest {

    private final MergeTwoList mergeTwoList = new MergeTwoList();

    @Test
    void arrayToListNodeCaseOne() {
        int[] array = new int[]{0, 2, 3, 4};
        MergeTwoList.ListNode resultNode = mergeTwoList.arrayToListNode(array);
        assertArrayEquals(array, mergeTwoList.nodeToArray(resultNode));
    }

}
