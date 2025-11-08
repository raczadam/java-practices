package com.raczadam.leetcode_practice.medium;


import java.util.*;

public class ValidSudoku {

    public boolean isValidSudoku1(char[][] board) {
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

    public boolean isValidSudoku(char[][] board) {
        final char emptyCell = '.';
        Set<Character>[] rows = new Set[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
        }

        Set<Character>[] columns = new Set[9];
        for (int i = 0; i < 9; i++) {
            columns[i] = new HashSet<>();
        }

        Set<Character>[][] segments = new Set[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                segments[i][j] = new HashSet<>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Row cell: (i, j)
                char r = board[i][j];
                if (r != emptyCell) {
                    // row check
                    if (!rows[i].add(r)){
                        return false;
                    }
                    // segment check for (i,j)
                    int br = i / 3;
                    int bc = j / 3;
                    if (!segments[br][bc].add(r)){
                        return false;
                    }
                }

                // Column cell: (j, i)
                char c = board[j][i];
                if (c != emptyCell) {
                    // column check
                    if (!columns[i].add(c)){
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
