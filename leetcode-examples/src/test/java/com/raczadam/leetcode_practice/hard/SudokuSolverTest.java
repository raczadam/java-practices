package com.raczadam.leetcode_practice.hard;

import com.raczadam.leetcode_practice.medium.ValidSudoku;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SudokuSolverTest {

    @Test
    void testSolveSudoku() {
        SudokuSolver solver = new SudokuSolver();
        ValidSudoku validator = new ValidSudoku();

        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {
                '6', '.', '.', '1', '9', '5', '.', '.', '.'}, {
                '.', '9', '8', '.', '.', '.', '.', '6', '.'}, {
                '8', '.', '.', '.', '6', '.', '.', '.', '3'}, {
                '4', '.', '.', '8', '.', '3', '.', '.', '1'}, {
                '7', '.', '.', '.', '2', '.', '.', '.', '6'}, {
                '.', '6', '.', '.', '.', '.', '2', '8', '.'}, {
                '.', '.', '.', '4', '1', '9', '.', '.', '5'}, {
                '.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        assertTrue(validator.isValidSudoku(board)); // quick check before run

        solver.solveSudoku(board);

        assertTrue(validator.isValidSudoku(board)); // check after run

        int numOfDots = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    numOfDots++;
                }
            }
        }

        assertEquals(0, numOfDots); // check board is completely filled
    }

}
