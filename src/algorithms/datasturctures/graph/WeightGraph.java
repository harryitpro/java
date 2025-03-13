package algorithms.datasturctures.graph;

import java.util.*;

public class WeightGraph {
    private int V; // Number of vertices
    private List<List<Edge>> adj; // Adjacency list

    static class Edge {
        int dest; // Destination vertex
        int weight; // Weight of the edge

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    // Constructor to initialize the graph
    WeightGraph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    void addEdge(int src, int dest, int weight) {
        adj.get(src).add(new Edge(dest, weight));
        // If the graph is undirected, uncomment the line below
        // adj.get(dest).add(new Edge(src, weight));
    }

    // Class to store vertex and its current distance (for PriorityQueue)
    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    // Dijkstra's algorithm to find shortest paths from source
    void dijkstra(int source) {
        // Array to store the shortest distance from source to each vertex
        int[] dist = new int[V];
        // Array to store the parent of each vertex in the shortest path tree
        int[] parent = new int[V];
        // Initialize distances to infinity and parents to -1
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        // PriorityQueue to store nodes with their distances (min-heap)
        PriorityQueue<Node> pq = new PriorityQueue<>();
        // Distance to source is 0
        dist[source] = 0;
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            // Extract the node with the minimum distance
            Node current = pq.poll();
            int u = current.vertex;

            // If we've already found a shorter path to u, skip
            if (current.distance > dist[u]) {
                continue;
            }

            // Explore all neighbors of u
            for (Edge edge : adj.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;

                // If we can improve the distance to v through u
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    parent[v] = u; // Update parent for path reconstruction
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        // Print shortest distances and paths
        printSolution(dist, parent, source);
    }

    // Helper method to print the shortest paths
    void printSolution(int[] dist, int[] parent, int source) {
        System.out.println("Vertex\tDistance from Source\tPath");
        for (int i = 0; i < V; i++) {
            System.out.print(i + "\t\t" + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]) + "\t\t");
            printPath(parent, i);
            System.out.println();
        }
    }

    // Helper method to print the path from source to vertex
    void printPath(int[] parent, int vertex) {
        if (vertex == -1) {
            return; // No path exists
        }
        Stack<Integer> path = new Stack<>();
        int current = vertex;
        while (current != -1) {
            path.push(current);
            current = parent[current];
        }
        while (!path.isEmpty()) {
            System.out.print(path.pop());
            if (!path.isEmpty()) {
                System.out.print(" -> ");
            }
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        WeightGraph graph = new WeightGraph(V);

        // Add edges to the graph (directed graph)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);

        // Run Dijkstra's algorithm from source vertex 0
        System.out.println("Shortest paths from source vertex 0:");
        graph.dijkstra(0);
    }
}
