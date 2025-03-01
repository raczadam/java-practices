package com.example.maze;

import java.util.Arrays;

public class BacktrackingMazeSolver {


    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


    public static void main(String[] args) throws Exception{
        MazeGenerator mazeGenerator = new MazeGenerator(50);
        mazeGenerator.generateMaze();

//        char[][] maze = {
//                {'S', '.', 'X', '.'},
//                {'X', '.', 'X', '.'},
//                {'.', '.', '.', 'X'},
//                {'X', 'X', '.', 'E'}
//        };

        char[][] maze = mazeGenerator.getMaze();

        int startX = 1, startY = 1; // Start position (row, col)

        System.out.println("Maze before solving:");
        //printMaze(maze);
        printMazeColorizedMaze(maze);

        if (solveMaze(maze, startX, startY)) {
            System.out.println("\nMaze after solving:");
            //printMaze(maze);
            printMazeColorizedMaze(maze);
        } else {
            System.out.println("\nNo path found.");
        }
    }


    public static boolean solveMaze(char[][] maze, int row, int col) throws Exception{
        // If out of bounds, or on a wall ('X'), or already visited ('V'), return false
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length ||
                maze[row][col] == 'X' || maze[row][col] == 'V') {
            return false;
        }

        // If we reach the exit ('E'), we are done!
        if (maze[row][col] == 'E') {
            return true;
        }

        // Mark current position as visited
        maze[row][col] = 'V';
//        printMazeColorizedMaze(maze);
//        Thread.sleep(50);

        // Try moving in all 4 directions (up, down, left, right)
        if (solveMaze(maze, row - 1, col) ||  // Up
                solveMaze(maze, row + 1, col) ||  // Down
                solveMaze(maze, row, col - 1) ||  // Left
                solveMaze(maze, row, col + 1)) {  // Right
            return true;  // If any move finds the exit, return true
        }

        // If no path is found, backtrack (undo the visit)
        maze[row][col] = '.';
        return false;
    }


    public static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static void printMazeColorizedMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char character : row) {
                System.out.print(getColorizedCharsWithSpace(character));
            }
            System.out.println(ANSI_BLACK_BACKGROUND);
        }
    }


    private static String getColorizedCharsWithSpace(char character) {
        String color = "";
        switch (character) {
            case '.':
                color = ANSI_BLACK_BACKGROUND;
                break;
            case 'X':
                color = ANSI_WHITE_BACKGROUND;
                break;
            case 'V':
                color = ANSI_GREEN_BACKGROUND;
                break;
            case 'S':
                color = ANSI_PURPLE_BACKGROUND;
                break;
            case 'E':
                color = ANSI_YELLOW_BACKGROUND;
                break;
        }

        return color + "   ";
    }


}
