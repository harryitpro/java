package algorithms.graph.implementation;

import java.util.*;

/**
 * Uses a HashMap or ArrayList to store edges.
 * More memory-efficient than a matrix.
 * Good for: Sparse graphs.
 */
public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    //directed graph
    public void addEdge(Integer source, Integer dest) {
        adjList.get(source).add(dest);
    }

    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
