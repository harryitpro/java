package algorithms.datasturctures.basic;

public class TreeOverview {
    /**
     * 🌳 Tree Data Structure Overview
     * A tree is a hierarchical data structure where elements (nodes) are connected in a parent-child relationship. It is widely used in computing for organizing data efficiently.
     *
     * 🔹 1. Basic Tree Terminology
     * Term	Description
     * Node	A single element in a tree.
     * Root	The topmost node (starting point of the tree).
     * Parent	A node that has one or more children.
     * Child	A node that descends from another node.
     * Leaf	A node with no children.
     * Sibling	Nodes that share the same parent.
     * Edge	A connection between two nodes.
     * Height(tree height) Number of edges from the root to the deepest node.
     * Depth(Node Depth)	Distance from the root to a specific node.
     * Subtree	A tree formed from any node and its descendants.
     * 🔹 2. Types of Trees
     * 1️⃣ Binary Tree → Each node has at most two children (Left, Right).
     * 2️⃣ Binary Search Tree (BST) → A sorted binary tree where Left < Root < Right.
     * 3️⃣ Balanced Tree (AVL, Red-Black Tree) → Self-balancing BST with O(log n) operations.
     * 4️⃣ Heap (Min Heap / Max Heap) → A complete binary tree used in priority queues.
     * 5️⃣ Trie (Prefix Tree) → Used for fast word lookups (e.g., autocomplete).
     * 6️⃣ B-Trees / B+ Trees → Used in database indexing (e.g., MySQL).
     * 7️⃣ General Tree → A tree where nodes can have any number of children.
     * 🔹 3. Example: Binary Tree
     * mathematica
     * Copy
     * Edit
     *         A
     *        / \
     *       B   C
     *      / \   \
     *     D   E   F
     * ✔ Root: A
     * ✔ Children of A: B, C
     * ✔ Leaf Nodes: D, E, F
     * 🔹 4. Common Tree Operations on a Balanced Tree
     * Operation	Description	Time Complexity (Balanced Tree)
     * Insertion	Add a node	O(log n)
     * Search	Find a node	O(log n)
     * Deletion	Remove a node	O(log n)
     * Traversal	Visit all nodes (Preorder, Inorder, Postorder)	O(n)
     * 🔹 5. Traversal Methods
     * 1️⃣ Preorder (Root → Left → Right) → Used for copying a tree.
     * 2️⃣ Inorder (Left → Root → Right) → Sorted order in BSTs.
     * 3️⃣ Postorder (Left → Right → Root) → Used for deleting a tree.
     * 4️⃣ Level Order (BFS) → Uses a queue to visit nodes level by level.
     *
     * 🚀 Where Are Trees Used?
     * ✔ File Systems (Directory structures)
     * ✔ Databases (B-Trees in indexing)
     * ✔ Compilers (Syntax Trees)
     * ✔ Artificial Intelligence (Decision Trees, Minimax Trees)
     * ✔ Networking (Routing Tables)
     * ✔ Game Development (AI Pathfinding)
     */
}
