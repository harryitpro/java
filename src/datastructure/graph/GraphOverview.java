package datastructure.graph;

public class GraphOverview {
    /**
     * Graph Data Structure Overview
     * A graph is a non-linear data structure consisting of nodes (vertices) and edges (connections) between them. It is widely used in social networks, navigation systems, and computer networks.
     *
     * 🔹 1. Graph Terminology
     * Term	Description
     * Vertex (Node)	A fundamental unit (point) in a graph.
     * Edge (Link)	A connection between two vertices.
     * Degree	Number of edges connected to a vertex.
     * Path	A sequence of edges connecting vertices.
     * Cycle	A path that starts and ends at the same vertex.
     * Connected Graph	A graph where all vertices are reachable from any other.
     * Weighted Graph	Each edge has a weight or cost.
     * Directed Graph (Digraph)	Edges have a direction (one-way connection).
     * Undirected Graph	Edges have no direction (two-way connection).
     * 🔹 2. Types of Graphs
     * 1️⃣ Undirected Graph → Edges have no direction.
     * 2️⃣ Directed Graph (Digraph) → Edges have a direction (A → B ≠ B → A).
     * 3️⃣ Weighted Graph → Edges have weights/costs (e.g., distances in a road network).
     * 4️⃣ Unweighted Graph → All edges are equal (no weights).
     * 5️⃣ Cyclic Graph → A path exists that forms a loop.
     * 6️⃣ Acyclic Graph (DAG - Directed Acyclic Graph) → No cycles (used in task scheduling).
     * 7️⃣ Connected Graph → Every vertex is reachable from another.
     * 8️⃣ Disconnected Graph → Some vertices are not reachable from others.
     *
     * 🔹 3. Graph Representation in Memory
     * 1️⃣ Adjacency Matrix (2D Array)
     * Uses an N x N matrix (N = number of vertices).
     * Efficient for dense graphs but wastes space for sparse graphs.
     * 📌 Example (Undirected Graph):
     * less
     * Copy
     * Edit
     *    A -- B
     *    |  /
     *    C
     * A	B	C
     * A	0	1	1
     * B	1	0	1
     * C	1	1	0
     * java
     * Copy
     * Edit
     * int[][] adjMatrix = new int[N][N]; // N = number of vertices
     * ✅ Pros: Fast lookups O(1)
     * ❌ Cons: High space usage O(N²)
     *
     * 2️⃣ Adjacency List (List of Lists)
     * Stores only existing edges → Efficient for sparse graphs.
     * Uses ArrayList or HashMap to store neighbors.
     * 📌 Example (Graph with adjacency list representation):
     * java
     * Copy
     * Edit
     * Map<Integer, List<Integer>> adjList = new HashMap<>();
     * adjList.put(0, Arrays.asList(1, 2));
     * adjList.put(1, Arrays.asList(0, 2));
     * adjList.put(2, Arrays.asList(0, 1));
     * ✅ Pros: Uses O(V + E) space (better for sparse graphs)
     * ❌ Cons: Lookup takes O(deg(V)) (depends on node degree)
     *
     * 🔹 4. Graph Traversal Algorithms
     * Graph traversal is the process of visiting nodes in a systematic way.
     *
     * 🔹 1️⃣ Depth First Search (DFS) - Uses Stack (Recursive or Iterative)
     * Explores as deep as possible before backtracking.
     * Used for maze solving, cycle detection, pathfinding.
     * java
     * Copy
     * Edit
     * void DFS(int node, boolean[] visited, List<List<Integer>> graph) {
     *     visited[node] = true;
     *     System.out.print(node + " ");
     *     for (int neighbor : graph.get(node)) {
     *         if (!visited[neighbor]) {
     *             DFS(neighbor, visited, graph);
     *         }
     *     }
     * }
     * 📌 Example Output for Graph Traversal:
     *
     * nginx
     * Copy
     * Edit
     * DFS starting at node 0 → 0 → 1 → 3 → 2
     * 🔹 2️⃣ Breadth First Search (BFS) - Uses Queue
     * Explores level by level (shortest path in unweighted graphs).
     * Used in shortest path problems (unweighted graphs), social networks.
     * java
     * Copy
     * Edit
     * void BFS(int start, List<List<Integer>> graph) {
     *     boolean[] visited = new boolean[graph.size()];
     *     Queue<Integer> queue = new LinkedList<>();
     *
     *     visited[start] = true;
     *     queue.add(start);
     *
     *     while (!queue.isEmpty()) {
     *         int node = queue.poll();
     *         System.out.print(node + " ");
     *
     *         for (int neighbor : graph.get(node)) {
     *             if (!visited[neighbor]) {
     *                 visited[neighbor] = true;
     *                 queue.add(neighbor);
     *             }
     *         }
     *     }
     * }
     * 📌 Example Output for Graph Traversal:
     *
     * nginx
     * Copy
     * Edit
     * BFS starting at node 0 → 0 → 1 → 2 → 3
     * 🔹 5. Graph Applications
     * ✔ Google Maps / GPS Navigation (Shortest path using Dijkstra’s Algorithm)
     * ✔ Social Networks (Finding friend connections)
     * ✔ Web Crawlers (Using BFS to traverse web pages)
     * ✔ Computer Networks (Routing protocols use graphs)
     * ✔ AI Pathfinding (A Algorithm)*
     *
     * 🔹 6. Shortest Path Algorithms
     * Algorithm	Use Case	Time Complexity
     * Dijkstra's Algorithm	Single-source shortest path (weighted graphs)	O((V + E) log V)
     * Bellman-Ford Algorithm	Handles negative weights	O(VE)
     * Floyd-Warshall Algorithm	All-pairs shortest path	O(V³)
     * A Algorithm*	Optimized pathfinding (AI, games)	O(E) (heuristic-based)
     * 🚀 Summary
     * Graph Concept	Details
     * Types of Graphs	Directed, Undirected, Weighted, Unweighted, Cyclic, Acyclic
     * Representation	Adjacency Matrix (O(N²)) vs. Adjacency List (O(V + E))
     * Traversal Algorithms	DFS (Depth-first search) → Stack (Recursive/Iterative)
     * BFS (Breadth-first search) → Queue
     * Shortest Path Algorithms	Dijkstra, Bellman-Ford, Floyd-Warshall, A*
     */
}
