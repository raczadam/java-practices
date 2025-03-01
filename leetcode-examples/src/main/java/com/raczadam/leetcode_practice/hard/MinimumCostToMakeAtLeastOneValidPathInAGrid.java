package com.raczadam.leetcode_practice.hard;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/description/?envType=daily-question&envId=2025-01-18
public class MinimumCostToMakeAtLeastOneValidPathInAGrid {


    /*
    Input: grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
    Output: 3

    Input: grid = [[1,1,3],[3,2,2],[1,1,4]]
    Output: 0

    Input: grid = [[1,1,3],[3,2,2],[1,1,4]]
    Output: 0
     */


    public static void main(String[] args) {
        System.out.println(minCost(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}}));
        System.out.println(minCost(new int[][]{{1, 1, 3}, {3, 2, 2}, {1, 1, 4}}));
        System.out.println(minCost(new int[][]{{1, 1, 3}, {3, 2, 2}, {1, 1, 4}}));

        // TODO fixme
    }


    public static int minCost(int[][] grid) {
        return 0;
    }


    public static int bfs(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] start = new int[]{0, 0};
        int[] target = new int[]{grid.length - 1, grid[grid.length - 1].length - 1};

        // Directions for moving: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS setup: queue and visited
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        // Add the starting point to the queue
        queue.add(new int[]{start[0], start[1], 0}); // [row, col, steps]
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
