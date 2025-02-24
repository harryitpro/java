package datastructure.heap;

import java.util.*;

/**
 * Here's a Java implementation of a Binary Heap (Min-Heap and Max-Heap).
 * <p>
 * A Binary Heap is a complete binary tree that satisfies the heap property:
 * <p>
 * Min-Heap: Parent node is smaller than or equal to its children.
 * Max-Heap: Parent node is larger than or equal to its children.
 */
class BinaryHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public BinaryHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Insert a new value into the heap
    //add to the end of the array.

    /**
     * add to the end of the array.
     * @param value
     */
    public void insert(int value) {
        heap[size] = value;
        int current = size;
        size++;

        // Heapify Up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Extract the minimum element (root) from Min-Heap
    public int extractMin() {
        if (size == 0) throw new IllegalStateException("Heap is empty!");
        if (size == 1) return heap[--size];

        int root = heap[0];
        heap[0] = heap[--size];

        heapifyDown(0);
        return root;
    }

    // Heapify Down to maintain Min-Heap property
    private void heapifyDown(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;

        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    // Swap two elements
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Print heap array
    public void printHeap() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        BinaryHeap minHeap = new BinaryHeap(10);

        minHeap.insert(10);
        minHeap.insert(15);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(20);
        minHeap.insert(35);

        minHeap.printHeap();  // Output: Heap: [10, 15, 20, 40, 50, 30, 35]

        System.out.println("Extracted Min: " + minHeap.extractMin()); // Output: 10
        minHeap.printHeap();  // Updated heap
    }
}
