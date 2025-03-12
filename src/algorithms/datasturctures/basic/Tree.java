package algorithms.datasturctures.basic;

import java.util.ArrayList;
import java.util.List;

// a general Tree is represented by a root node.

/**
 * APIs:
 */
public class Tree {
    Node root;

    public Tree(String rootData) {
        root = new Node(rootData);
    }

    //iterate nodes in the tree
    //recursively iterate subtrees. -- DSF

    /**
     * Preorder Traversal of a Tree
     * Preorder traversal is a depth-first traversal (DFS) method where the nodes of a tree are visited in the following order:
     *
     * 1️⃣ Visit the root node first.
     * 2️⃣ Traverse subtree recursively.
     * @param node : tree or subtree
     */
    public void preOrderTraversal(Node node) {
        //base condition: return if subtree is empty
        if (node == null) return;

        //process: print tree
        System.out.print(node.data + " ");

        //go to all subtrees, iterate
        for (Node child : node.children) {
            preOrderTraversal(child);
        }
    }

    // Tree Node class
    static class Node {
        String data;
        List<Node> children;

        public Node(String data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public void addChild(Node child) {
            children.add(child);
        }
    }

    public void printTree(Node node, String prefix) {
        if (node == null) return;
        System.out.println(prefix + node.data);
        for (Node child : node.children) {
            printTree(child, prefix + "  ");
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree("Root");

        Node child1 = new Node("Child1");
        Node child2 = new Node("Child2");
        tree.root.addChild(child1);
        tree.root.addChild(child2);

        child1.addChild(new Node("Child1.1"));
        child1.addChild(new Node("Child1.2"));
        child2.addChild(new Node("Child2.1"));

        tree.printTree(tree.root, "");

        System.out.println("Preorder Traversal:");
        tree.preOrderTraversal(tree.root);
    }
}

