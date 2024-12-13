package com.raczadam.leetcode_practice.easy;

import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/?envType=daily-question&envId=2024-12-12
public class TakeGiftsFromTheRichestPile {

    public long pickGifts(int[] gifts, int k) {

        System.out.println(gifts.length);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int key : gifts) {
            map.put(key, getValue(map, key));
        }
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> lastEntry = map.lastEntry();
            int newKey = (int) Math.sqrt(lastEntry.getKey());
            int newValue = getValue(map, newKey);
            if (newKey != lastEntry.getKey()) {
                map.remove(lastEntry.getKey());
                map.put(newKey, newValue);
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> lastEntry : map.entrySet()) {
            result += lastEntry.getKey() * lastEntry.getValue();
        }

        return result;
    }


    private int getValue(Map<Integer, Integer> map, int key) {
        Integer value = map.get(key);
        return value != null ? ++value : 1;
    }


}
