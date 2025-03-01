package com.example.maze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MazeGenerator {


    private final int SIZE;
    private final char WALL = 'X';
    private final char PATH = '.';
    private final char START = 'S';
    private final char EXIT = 'E';
    private final int[][] directions = {{-2, 0}, {2, 0}, {0, -2}, {0, 2}};
    private final char[][] maze;


    public MazeGenerator(int size) {
        SIZE = size;
        maze = new char[SIZE][SIZE];
    }


    public void generateMaze() {
        // Fill maze with walls
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(maze[i], WALL);
        }

        // Randomized Prim's Algorithm: Start at (1,1)
        Random rand = new Random();
        int startX = 1, startY = 1;
        maze[startX][startY] = PATH;

        List<int[]> frontier = new ArrayList<>();
        addFrontier(startX, startY, frontier, rand);

        while (!frontier.isEmpty()) {
            int[] cell = frontier.remove(rand.nextInt(frontier.size()));
            int x = cell[0], y = cell[1];

            if (maze[x][y] == WALL) {
                List<int[]> neighbors = getNeighbors(x, y);
                if (!neighbors.isEmpty()) {
                    int[] chosen = neighbors.get(rand.nextInt(neighbors.size()));
                    int nx = chosen[0], ny = chosen[1];

                    // Make path between (x,y) and (nx,ny)
                    maze[x][y] = PATH;
                    maze[(x + nx) / 2][(y + ny) / 2] = PATH;
                }
                addFrontier(x, y, frontier, rand);
            }
        }

        // Set start and exit positions
        maze[1][1] = START;
        maze[SIZE - 3][SIZE - 3] = EXIT;
    }


    private void addFrontier(int x, int y, List<int[]> frontier, Random rand) {
        for (int[] d : directions) {
            int nx = x + d[0], ny = y + d[1];
            if (nx > 0 && nx < SIZE - 1 && ny > 0 && ny < SIZE - 1 && maze[nx][ny] == WALL) {
                frontier.add(new int[]{nx, ny});
            }
        }
    }


    private List<int[]> getNeighbors(int x, int y) {
        List<int[]> neighbors = new ArrayList<>();
        for (int[] d : directions) {
            int nx = x + d[0], ny = y + d[1];
            if (nx > 0 && nx < SIZE - 1 && ny > 0 && ny < SIZE - 1 && maze[nx][ny] == PATH) {
                neighbors.add(new int[]{nx, ny});
            }
        }
        return neighbors;
    }


    public char[][] getMaze() {
        return maze;
    }



}
