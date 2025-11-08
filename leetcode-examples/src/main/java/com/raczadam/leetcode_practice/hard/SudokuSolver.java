package com.raczadam.leetcode_practice.hard;

public class SudokuSolver {


    public void solveSudoku(char[][] board) {
        solveSudoku0(board, 0);
    }

    private boolean solveSudoku0(char[][] board, int cell) {
        if (cell == 81) {
            return true;
        }

        int row = cell / 9;
        int col = cell % 9;

        if (board[row][col] != '.') {
            return solveSudoku0(board, cell + 1);
        }

        for (char i = '1'; i <= '9'; i++) {
            if (isValid(board, row, col, i)) {
                board[row][col] = i;
                if (solveSudoku0(board, cell + 1)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private boolean isValid(char[][] board, int row, int column, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][column] == num) {
                return false;
            }
        }
        int startRow = (row / 3) * 3;
        int startCol = (column / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}
