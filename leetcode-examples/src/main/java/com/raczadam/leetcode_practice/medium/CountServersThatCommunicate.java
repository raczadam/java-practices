package com.raczadam.leetcode_practice.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/count-servers-that-communicate/?envType=daily-question&envId=2025-01-23
public class CountServersThatCommunicate {


    public static void main(String[] args) {
        List<int[][]> input = new ArrayList<>();
        input.add(new int[][]{{1, 0}, {0, 1}});
        input.add(new int[][]{{1, 0}, {1, 1}});
        input.add(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}});
        input.add(new int[][]{{1, 0, 0, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}});

        input.forEach(i -> System.out.println(countServers(i)));

        // TODO fixme
    }


    public static int countServers(int[][] grid) {
        int numberOfConnectedServers = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (isHasNeighbor(grid, i, j)) {
                    numberOfConnectedServers++;
                }
            }
        }
        return numberOfConnectedServers;
    }


    private static boolean isHasNeighbor(int[][] grid, int row, int colum) {
        if (grid[row][colum] == 0) {
            return false;
        }
        boolean hasNeighbor = false;
        if (row - 1 > -1) {
            hasNeighbor = grid[row - 1][colum] == 1;
        }
        if (row + 1 < grid.length) {
            hasNeighbor = hasNeighbor || grid[row + 1][colum] == 1;
        }
        if (colum - 1 > -1) {
            hasNeighbor = hasNeighbor || grid[row][colum - 1] == 1;
        }
        if (colum + 1 < grid[row].length) {
            hasNeighbor = hasNeighbor || grid[row][colum + 1] == 1;
        }
        return hasNeighbor;
    }


//    public static int countServers(int[][] grid) {
//        int numberOfConnectedServers = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (isHasNeighbor(grid, i, j)) {
//                    //System.out.println("i: " + i + ", j: " + j);
//                    //System.out.println(grid[i][j]);
//                    numberOfConnectedServers++;
//                }
//            }
//        }
//        return numberOfConnectedServers;
//    }
//
//
//    private static boolean isHasNeighbor(int[][] grid, int row, int colum) {
//        if (grid[row][colum] == 0) {
//            return false;
//        }
//        boolean hasNeighbor = false;
//
//        if (row - 1 > -1) {
//            //System.out.println("notFirstRow");
//            hasNeighbor = grid[row - 1][colum] == 1;
//            //System.out.println("hasNeighbor: " + hasNeighbor);
//        }
//        if (row + 1 < grid[row].length) {
//            //System.out.println("notLastRow");
//            hasNeighbor = hasNeighbor || grid[row + 1][colum] == 1;
//            //System.out.println("hasNeighbor: " + hasNeighbor);
//        }
//        if (colum - 1 > -1) {
//            //System.out.println("notFirstColumn");
//            hasNeighbor = hasNeighbor || grid[row][colum - 1] == 1;
//            //System.out.println("hasNeighbor: " + hasNeighbor);
//        }
//        if (colum + 1 < grid.length) {
//            //System.out.println("notLastColumn");
//            hasNeighbor = hasNeighbor || grid[row][colum + 1] == 1;
//            //System.out.println("hasNeighbor: " + hasNeighbor);
//        }
//        return hasNeighbor;
//    }


}
