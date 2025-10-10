package com.raczadam.leetcode_practice.easy;

import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        String opening = "([{";
        String closing = ")]}";
        int numOfOpeningTags = 0;
        int numOfClosingTags = 0;
        for (char current : chars) {
            int index = opening.indexOf(current);
            if (index >= 0) {
                stack.add(current);
                numOfOpeningTags++;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                index = closing.indexOf(current);
                char fromStack = stack.peek();
                if (index < 0 || opening.charAt(index) != fromStack) {
                    return false;
                }
                stack.pop();
                numOfClosingTags++;
            }
        }
        return numOfOpeningTags == numOfClosingTags;
    }

    public static void main(String[] args) {

        ValidParentheses obj = new ValidParentheses();

        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("(]"));
        System.out.println(obj.isValid("([])"));
        System.out.println(obj.isValid("([)]"));
        System.out.println(obj.isValid("(("));
        System.out.println(obj.isValid("){"));
        // expected: true, true, false, true, false, false, false

    }


}
