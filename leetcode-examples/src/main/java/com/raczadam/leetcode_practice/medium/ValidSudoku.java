package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (char[] row : board) {
            if (isNotValidSegment(row)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            if (isNotValidSegment(column)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                char[] segment = new char[9];
                int counter = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        segment[counter++] = board[k][l];
                    }
                }
                if (isNotValidSegment(segment)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isNotValidSegment(char... chars) {
        List<Character> characterList = new ArrayList<>();
        for (char aChar : chars) {
            if (aChar != '.') {
                characterList.add(aChar);
            }
        }
        return characterList.size() != new HashSet<>(characterList).size();
    }

}
