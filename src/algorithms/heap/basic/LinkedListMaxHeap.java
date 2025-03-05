package algorithms.heap.basic;

import java.util.LinkedList;
import java.util.Queue;

// Max-Heap class
public class LinkedListMaxHeap {
    private HeapNode root;
    private int size;

    public LinkedListMaxHeap() {
        root = null;
        size = 0;
    }

    // Insert a new element
    public void insert(int value) {
        HeapNode newNode = new HeapNode(value);
        size++;

        if (root == null) {
            root = newNode;
            return;
        }

        // Use a queue to find the next available position (level-order)
        Queue<HeapNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            HeapNode current = queue.poll();

            // Check left child
            if (current.left == null) {
                current.left = newNode;
                newNode.parent = current;
                heapifyUp(newNode);
                return;
            } else {
                queue.add(current.left);
            }

            // Check right child
            if (current.right == null) {
                current.right = newNode;
                newNode.parent = current;
                heapifyUp(newNode);
                return;
            } else {
                queue.add(current.right);
            }
        }
    }

    // Heapify up to maintain max-heap property
    private void heapifyUp(HeapNode node) {
        while (node.parent != null && node.data > node.parent.data) {
            // Swap with parent
            int temp = node.data;
            node.data = node.parent.data;
            node.parent.data = temp;
            node = node.parent; // Move up
        }
    }

    // Extract the maximum element (root)
    public int extractMax() {
        if (root == null) {
            throw new IllegalStateException("Heap is empty");
        }

        int max = root.data;
        size--;

        if (size == 0) {
            root = null;
            return max;
        }

        // Find the last node using level-order traversal
        HeapNode lastNode = findLastNode();
        root.data = lastNode.data;

        // Remove the last node
        removeLastNode(lastNode);

        // Heapify down from root
        heapifyDown(root);

        return max;
    }

    // Find the last node in level-order
    private HeapNode findLastNode() {
        Queue<HeapNode> queue = new LinkedList<>();
        queue.add(root);
        HeapNode last = null;

        while (!queue.isEmpty()) {
            last = queue.poll();
            if (last.left != null) queue.add(last.left);
            if (last.right != null) queue.add(last.right);
        }
        return last;
    }

    // Remove the last node
    private void removeLastNode(HeapNode last) {
        if (last.parent != null) {
            if (last.parent.left == last) {
                last.parent.left = null;
            } else {
                last.parent.right = null;
            }
        }
    }

    // Heapify down to maintain max-heap property
    private void heapifyDown(HeapNode node) {
        while (true) {
            HeapNode largest = node;
            if (node.left != null && node.left.data > largest.data) {
                largest = node.left;
            }
            if (node.right != null && node.right.data > largest.data) {
                largest = node.right;
            }

            if (largest == node) {
                break; // Heap property satisfied
            }

            // Swap with the largest child
            int temp = node.data;
            node.data = largest.data;
            largest.data = temp;
            node = largest; // Move down
        }
    }

    // Check if heap is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Get size of heap
    public int size() {
        return size;
    }

    // Utility to print the heap (inorder traversal for visualization)
    public void printHeap() {
        inorderPrint(root);
        System.out.println();
    }

    private void inorderPrint(HeapNode node) {
        if (node != null) {
            inorderPrint(node.left);
            System.out.print(node.data + " ");
            inorderPrint(node.right);
        }
    }

    // Node class for the heap
    static class HeapNode {
        int data;
        HeapNode left;
        HeapNode right;
        HeapNode parent; // For easier heapify-up

        public HeapNode(int data) {
            this.data = data;
            left = null;
            right = null;
            parent = null;
        }
    }

    // Main method to test the heap
    public static void main(String[] args) {
        LinkedListMaxHeap heap = new LinkedListMaxHeap();

        // Insert some values
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.insert(25);

        System.out.println("Heap after insertions:");
        heap.printHeap(); // Not necessarily sorted, just for visualization

        System.out.println("Extracted max: " + heap.extractMax());
        System.out.println("Heap after extracting max:");
        heap.printHeap();

        System.out.println("Size: " + heap.size());
    }
}
