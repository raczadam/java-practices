package com.raczadam.leetcode_practice.hard;

import java.util.*;

// https://leetcode.com/problems/merge-k-sorted-lists/description/
public class MergeKLists {

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

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> nodesAsList = new LinkedList<>();
        Arrays.stream(lists).forEach(arr -> nodesAsList.addAll(nodeToList(arr)));
        Collections.sort(nodesAsList);
        return arrayToListNode(nodesAsList.stream().mapToInt(Integer::intValue).toArray());
    }

}
