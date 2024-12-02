package com.raczadam.leetcode_practice.easy;

import java.util.LinkedList;
import java.util.List;

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

    public MergeTwoList.ListNode arrayToListNode(int[] array) {
        int length = array.length;
        if (length == 0) {
            return new MergeTwoList.ListNode();
        }
        if (length == 1) {
            return new MergeTwoList.ListNode(array[0]);
        }
        MergeTwoList.ListNode result = new MergeTwoList.ListNode(array[length - 1]);
        for (int i = length - 2; i >= 0; i--) {
            result = new MergeTwoList.ListNode(array[i], result);
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
        // FIXME
        return null;
    }

}


