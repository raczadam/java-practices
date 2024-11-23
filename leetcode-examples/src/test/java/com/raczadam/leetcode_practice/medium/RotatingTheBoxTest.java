package com.raczadam.leetcode_practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotatingTheBoxTest {


    private final RotatingTheBox rotatingTheBox = new RotatingTheBox();


    @Test
    void rotateTheBoxCaseOne() {
        /*
        Input: box = [['#','.','#']]
        Output: [['.'],
                 ['#'],
                 ['#']]
         */
        char[][] input = new char[][]{{'#', '.', '#'}};
        char[][] expected = new char[][]{{'.'},
                {'#'},
                {'#'}};
        assertArrayEquals(expected, rotatingTheBox.rotateTheBox(input));
    }


    @Test
    void rotateTheBoxCaseTwo() {
        /*
        Input: box = [['#','.','*','.'],
              ['#','#','*','.']]
        Output: [['#','.'],
                 ['#','#'],
                 ['*','*'],
                 ['.','.']]
         */
        char[][] input = new char[][]{{'#', '.', '*', '.'},
                {'#', '#', '*', '.'}};
        char[][] expected = new char[][]{{'#', '.'},
                {'#', '#'},
                {'*', '*'},
                {'.', '.'}};
        assertArrayEquals(expected, rotatingTheBox.rotateTheBox(input));
    }


    @Test
    void rotateTheBoxCaseThree() {
        /*
        Input: box = [['#','#','*','.','*','.'],
              ['#','#','#','*','.','.'],
              ['#','#','#','.','#','.']]
        Output: [['.','#','#'],
                 ['.','#','#'],
                 ['#','#','*'],
                 ['#','*','.'],
                 ['#','.','*'],
                 ['#','.','.']]
         */
        char[][] input = new char[][]{{'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}};
        char[][] expected = new char[][]{{'.', '#', '#'},
                {'.', '#', '#'},
                {'#', '#', '*'},
                {'#', '*', '.'},
                {'#', '.', '*'},
                {'#', '.', '.'}};
        assertArrayEquals(expected, rotatingTheBox.rotateTheBox(input));
    }


}
