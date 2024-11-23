package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/rotating-the-box/?envType=daily-question&envId=2024-11-23
public class RotatingTheBox {


    /*
        You are given an m x n matrix of characters box representing a side-view of a box.
        Each cell of the box is one of the following:
        A stone '#'
        A stationary obstacle '*'
        Empty '.'
        The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity.
        Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box.
        Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.

        It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.

        Return an n x m matrix representing the box after the rotation described above.
     */
    // bruteforce solution: O(N∗M∗Log(M))
    public char[][] rotateTheBox(char[][] box) {
        // gravity first
        for (int i = 0; i < box.length; i++) {
            box[i] = doGravity(box[i]);
        }
        return rotate(box);
    }


    // little overkill, but works
    public char[] doGravity(char[] example) {
        List<Character> gravitated = new ArrayList<>(example.length);
        List<Character> subArray = new ArrayList<>();
        for (int i = 0; i < example.length; i++) {
            if (example[i] == '*') {
                subArray.sort(Collections.reverseOrder());
                subArray.add('*');
                gravitated.addAll(subArray);
                subArray = new ArrayList<>(example.length - i);
            } else {
                subArray.add(example[i]);
            }
        }
        subArray.sort(Collections.reverseOrder());
        gravitated.addAll(subArray);

        char[] gravitatedAsArray = new char[gravitated.size()];
        for (int i = 0; i < gravitated.size(); i++) {
            gravitatedAsArray[i] = gravitated.get(i);
        }
        return gravitatedAsArray;
    }


    private char[][] rotate(char[][] box) {
        char[][] temp = new char[box[0].length][box.length];
        int columnCounter = 0;
        for (int i = box.length - 1; i >= 0; i--) {
            for (int j = 0; j < box[i].length; j++) {
                temp[j][columnCounter] = box[i][j];
            }
            columnCounter++;
        }
        return temp;
    }


}
