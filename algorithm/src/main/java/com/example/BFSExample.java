package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSExample {


    public static void main(String[] args) {
        // Adjacency list representation of a graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(5, 6));
        graph.put(3, Collections.singletonList(7));
        graph.put(4, Collections.singletonList(8));
        graph.put(5, Collections.emptyList());
        graph.put(6, Collections.emptyList());
        graph.put(7, Collections.emptyList());
        graph.put(8, Collections.emptyList());


        bfs(1, graph); // Start BFS from node 1
    }


    public static void bfs(int start, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }


}
