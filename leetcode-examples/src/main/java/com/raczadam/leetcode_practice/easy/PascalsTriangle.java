package com.raczadam.leetcode_practice.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
// https://leetcode.com/problems/pascals-triangle-ii/
public class PascalsTriangle {


    private static final List<List<Integer>> rowsCache = new ArrayList<>(34);

    static {
        rowsCache.add(List.of(1));
        rowsCache.add(List.of(1, 1));
        for (int i = 3; i <= 34; i++) {
            List<Integer> current = new ArrayList<>(Collections.nCopies(i, 1));
            List<Integer> previous = rowsCache.get(i - 2);
            for (int j = 1; j < previous.size(); j++) {
                current.set(j, previous.get(j - 1) + previous.get(j));
            }
            rowsCache.add(current);
        }
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(rowsCache.get(i));
        }
        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        return rowsCache.get(rowIndex);
    }

}
