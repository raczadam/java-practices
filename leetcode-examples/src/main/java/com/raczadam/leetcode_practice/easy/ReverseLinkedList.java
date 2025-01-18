package com.raczadam.leetcode_practice.easy;

import com.raczadam.leetcode_practice.utility.structure.ListNode;

import java.util.Stack;

// https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {


    public static ListNode reverseListIterative(ListNode head) {
        if (head == null)
            return null;

        Stack<ListNode> nodeStack = new Stack<>();
        int counter = 0;
        while (head != null) {
            nodeStack.add(head);
            ListNode next = head.next;
            if (counter == 0) {
                head.next = null;
            }
            head = next;
            counter++;
        }

        ListNode firstElement = nodeStack.pop();
        ListNode next = firstElement;

        while (!nodeStack.isEmpty() && nodeStack.peek() != null) {
            ListNode temp = nodeStack.pop();
            next.next = temp;
            next = temp;
        }
        return firstElement;
    }


}
