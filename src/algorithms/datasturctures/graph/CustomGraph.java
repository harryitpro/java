package algorithms.datasturctures.graph;

import java.util.*;

/**
 * Uses a HashMap or ArrayList to store edges.
 * More memory-efficient than a matrix.
 * Good for: Sparse graphs.
 */
public class CustomGraph {
    private Map<Integer, List<Integer>> graph;

    public CustomGraph() {
        graph = new HashMap<>();
    }

    /**
     * add Edge from i -> j
     */
    public void addEdge(Integer i, Integer j) {
        graph.putIfAbsent(i, new ArrayList<Integer>());
        graph.get(i).add(j);
    }

    //build undirected graph from an adjList.
    public void addAdjList(List<Integer> adjList) {
        //FOR each element in the list. -- complete pseudo code description
        for (int i = 0; i < adjList.size(); i++) {
            for (int j = 0; j < adjList.size(); j++) {
                //pair i and j to be an Edge.
                if (i != j) {
                    addEdge(adjList.get(i), adjList.get(j));
                }
            }
        }
    }

    public void printGraph() {
        for (var entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        CustomGraph customGraph = new CustomGraph();
        customGraph.addAdjList(List.of(0, 1, 2));
        customGraph.addAdjList(List.of(2, 3));
        customGraph.printGraph();
        /**
         0 -> [1, 2]
         1 -> [0, 2]
         2 -> [0, 1, 3]
         3 -> [2]
         */
    }
}
