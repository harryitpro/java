package datastructure.graph;

import java.util.*;

/**
 * represent a graph using Map, to contain vertex(vertices and edges)
 * Key: individual vertex
 * Value: List<Integer>, all the destination vertices, or connected vertices.
 * <p>
 * graph like below
 *   1
 * /  \
 * 2     3
 * /  \     \
 * 4   5      6
 * <p>
 * <p>
 * expected printing result:
 * 1 -> 2, 3
 * 2 -> 4, 5
 * 3 -> 6
 */
public class Graph {
    private Map<Integer, List<Integer>> adjMap = new HashMap<>();

    public void addEdge(Integer source, Integer dest) {
        adjMap.putIfAbsent(source, new ArrayList<>());
        adjMap.get(source).add(dest);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        //question: should we add empty edge for vertex?

    }
}
