package algorithms.tree.basic;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    //APIs:
    //insert, search, delete, iterate
    public void insert(int data) {
        //use recursive method to insert:
        Node node = new Node(data);
        root = insert(root, node);
    }

    private Node insert(Node subRoot, Node node) {
        if (subRoot == null) {
            subRoot = node;
            return subRoot;
        }
        if (node.data < subRoot.data) {
            subRoot.left = insert(subRoot.left, node);
        } else if (node.data > subRoot.data) {
            subRoot.right = insert(subRoot.right, node);
        }
        return subRoot;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder() {
        System.out.print("Inorder traversal: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }

        // Print traversals
        bst.inorder();    // Should print: 20 30 40 50 60 70 80
//        bst.preorder();   // Should print: 50 30 20 40 70 60 80
//        bst.postorder();  // Should print: 20 40 30 60 80 70 50
//
//        // Test search
//        System.out.println("Search 40: " + bst.search(40));  // true
//        System.out.println("Search 90: " + bst.search(90));  // false
//
//        // Test delete
//        System.out.println("\nDeleting 30...");
//        bst.delete(30);
//        bst.inorder();    // Should print: 20 40 50 60 70 80
    }
}
