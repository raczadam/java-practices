package com.raczadam.leetcode_practice.utility.structure;

import java.util.LinkedList;
import java.util.List;

public class ListNodeUtility {


    private ListNodeUtility() {
    }


    public static ListNode arrayToListNode(int[] array) {
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


    public static List<Integer> nodeToList(ListNode listNode) {
        List<Integer> temp = new LinkedList<>();
        while (listNode != null) {
            temp.add(listNode.val);
            listNode = listNode.next;
        }
        return temp;
    }


    public static int[] listToArray(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] nodeToArray(ListNode listNode) {
        return listToArray(nodeToList(listNode));
    }


}
