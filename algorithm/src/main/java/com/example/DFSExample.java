package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSExample {


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

        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS Traversal:");
        dfs(1, graph, visited); // Start DFS from node 1
    }


    public static void dfs(int current, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (visited.contains(current)) return;

        visited.add(current);
        System.out.print(current + " ");

        for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {
            dfs(neighbor, graph, visited);
        }
    }


}
