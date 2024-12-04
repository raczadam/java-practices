package com.raczadam.leetcode_practice.medium;

// https://leetcode.com/problems/container-with-most-water/description/
public class MaxArea {


    public int maxArea(int[] height) {
        int area = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        while (leftPointer < rightPointer) {
            area = Math.max(countArea(height[leftPointer], height[rightPointer], leftPointer, rightPointer), area);
            if (height[leftPointer] > height[rightPointer]) {
                rightPointer--;
            } else if (height[rightPointer] > height[leftPointer]) {
                leftPointer++;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return area;
    }


    private int countArea(int leftHeight, int rightHeight, int leftIndex, int rightIndex) {
        return Math.min(leftHeight, rightHeight) * (rightIndex - leftIndex);
    }


}
