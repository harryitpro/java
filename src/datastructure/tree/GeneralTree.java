package datastructure.tree;

import java.util.*;

class GeneralTree<T> {
    static class TreeNode<T> {
        T data;
        List<TreeNode<T>> children;

        public TreeNode(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public void addChild(TreeNode<T> child) {
            children.add(child);
        }

        public void removeChild(TreeNode<T> child) {
            children.remove(child);
        }
    }
    private TreeNode<T> root;

    public GeneralTree(T rootData) {
        this.root = new TreeNode<>(rootData);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    // Depth-First Traversal (Preorder)
    public void dfs(TreeNode<T> node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        for (TreeNode<T> child : node.children) {
            dfs(child);
        }
    }


    // Breadth-First Traversal (Level Order)
    public void bfs() {
        if (root == null) return;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();
            System.out.print(node.data + " ");

            for (TreeNode<T> child : node.children) {
                queue.add(child);
            }
        }
    }
}

