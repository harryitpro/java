package datastructure.tree;

import java.util.ArrayList;
import java.util.List;

// Tree class
public class Tree {
    // Tree Node class
    static class TreeNode {
        String data;
        List<TreeNode> children;

        public TreeNode(String data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public void addChild(TreeNode child) {
            children.add(child);
        }
    }

    TreeNode root;

    public Tree(String rootData) {
        root = new TreeNode(rootData);
    }

    public void printTree(TreeNode node, String prefix) {
        if (node == null) return;
        System.out.println(prefix + node.data);
        for (TreeNode child : node.children) {
            printTree(child, prefix + "  ");
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        for (TreeNode child : node.children) {
            preOrderTraversal(child);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree("Root");

        TreeNode child1 = new TreeNode("Child1");
        TreeNode child2 = new TreeNode("Child2");
        tree.root.addChild(child1);
        tree.root.addChild(child2);

        child1.addChild(new TreeNode("Child1.1"));
        child1.addChild(new TreeNode("Child1.2"));
        child2.addChild(new TreeNode("Child2.1"));

        tree.printTree(tree.root, "");

        System.out.println("Preorder Traversal:");
        tree.preOrderTraversal(tree.root);
    }
}

