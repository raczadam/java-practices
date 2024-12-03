package com.raczadam.leetcode_practice.hard;

import com.raczadam.leetcode_practice.utility.IntUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeKListsTest {

    private final MergeKLists mergeKLists = new MergeKLists();

    @Test
    void test_mergeKLists() {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        int[] arr4 = new int[]{0};
        MergeKLists.ListNode[] nodes = new MergeKLists.ListNode[]{mergeKLists.arrayToListNode(arr1),
                mergeKLists.arrayToListNode(arr2),
                mergeKLists.arrayToListNode(arr3),
                mergeKLists.arrayToListNode(arr4)};
        MergeKLists.ListNode merged = mergeKLists.mergeKLists(nodes);
        int[] expected = IntUtil.reduceAndSortTwoDimensionalArray(new int[][]{arr1, arr2, arr3, arr4});
        assertArrayEquals(expected, mergeKLists.nodeToArray(merged));
    }

}
