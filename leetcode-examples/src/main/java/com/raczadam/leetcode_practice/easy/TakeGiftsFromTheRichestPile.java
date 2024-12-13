package com.raczadam.leetcode_practice.easy;

import java.util.Collections;
import java.util.PriorityQueue;

// https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/?envType=daily-question&envId=2024-12-12
public class TakeGiftsFromTheRichestPile {


    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            queue.add((long) gift);
        }
        for (int i = 0; i < k; i++) {
            queue.add((long) Math.sqrt(queue.remove()));
        }
        return queue.stream().reduce(0L, Long::sum);
    }


}
