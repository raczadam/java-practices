package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class BFS2DArrayExample {


    public static void main(String[] args) {
        char[][] grid = {
                {'S', '.', '.', 'X'},
                {'.', 'X', '.', 'T'},
                {'.', '.', '.', '.'}
        };

        int[] start = {0, 0}; // Starting point (row, col)
        int[] target = {1, 3}; // Target point (row, col)

        int steps = bfs(grid, start, target);
        System.out.println("Shortest path to the target: " + (steps >= 0 ? steps : "No path found"));
    }


    public static int bfs(char[][] grid, int[] start, int[] target) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Directions for moving: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS setup: queue and visited
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        // Add the starting point to the queue
        queue.add(new int[]{start[0], start[1], 0}); // {row, col, steps}
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];

            // Check if we've reached the target
            if (row == target[0] && col == target[1]) {
                return steps;
            }

            // Explore neighbors
            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                // Check boundaries and obstacles
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol] && grid[newRow][newCol] != 'X') {
                    queue.add(new int[]{newRow, newCol, steps + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }

        // If we exhaust the queue without finding the target
        return -1;
    }


}

