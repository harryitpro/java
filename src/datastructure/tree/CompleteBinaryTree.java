package datastructure.tree;

/**
 * a binary tree is a tree with constraints that each parent at most has 2 children.
 * Where Are Binary Trees Used?
 * Application	How It’s Used
 * Binary Search Trees (BSTs)	Fast searching, insertion, and deletion
 * Heaps (Binary Heap)	Efficient priority queues (used in Dijkstra’s algorithm, heapsort)
 * Expression Trees	Used in compilers for parsing expressions (e.g., (a + b) * c)
 * Huffman Trees	Used in data compression (Huffman Encoding)
 * File Systems	Directory structures are organized as trees
 * Artificial Intelligence	Decision trees for AI models
 * Databases (B-Trees, B+ Trees)	Used in database indexing (e.g., MySQL, PostgreSQL)
 * Networking (Routing Algorithms)	Tree-based routing algorithms (e.g., IP routing)
 * Game Development (Minimax Trees)	Used for AI decision-making in games
 */
public class CompleteBinaryTree {
    Node root;

    //constructor
    public CompleteBinaryTree(String data) {
        this.root = new Node(data);
    }

    //add,remove,search,iterate
    static class Node {
        String data;
        Node left, right;

        public Node(String data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    //complete binary tree, the new node will be inserted by level
    //consult BFS
    private void insert(Node root, Node node) {
        //use a queue to
    }
}
