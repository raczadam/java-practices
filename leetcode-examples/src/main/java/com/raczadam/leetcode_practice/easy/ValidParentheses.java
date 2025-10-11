package com.raczadam.leetcode_practice.easy;

import java.util.*;

public class ValidParentheses {


    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
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
