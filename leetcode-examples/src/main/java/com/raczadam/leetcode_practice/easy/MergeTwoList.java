package com.raczadam.leetcode_practice.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode arrayToListNode(int[] array) {
        int length = array.length;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            return new ListNode(array[0]);
        }
        ListNode result = new ListNode(array[length - 1]);
        for (int i = length - 2; i >= 0; i--) {
            result = new ListNode(array[i], result);
        }
        return result;
    }

    public List<Integer> nodeToList(ListNode listNode) {
        List<Integer> temp = new LinkedList<>();
        while (listNode != null) {
            temp.add(listNode.val);
            listNode = listNode.next;
        }
        return temp;
    }

    public int[] listToArray(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] nodeToArray(ListNode listNode) {
        return listToArray(nodeToList(listNode));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int[] arr1 = IntStream.concat(Arrays.stream(nodeToArray(list1)),
                Arrays.stream(nodeToArray(list2))).toArray();
        Arrays.sort(arr1);
        return arrayToListNode(arr1);
    }

}


