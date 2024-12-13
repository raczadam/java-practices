package com.raczadam.leetcode_practice.easy;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

// https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/?envType=daily-question&envId=2024-12-12
public class TakeGiftsFromTheRichestPile {


    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            queue.add(gift);
        }
        for (int i = 0; i < k; i++) {
            queue.add((int) Math.sqrt(queue.remove()));
        }

        long result = 0;
        for (Integer gift : queue) {
            result += gift;
        }
        return result;
    }


}
