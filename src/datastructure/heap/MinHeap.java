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
public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Get parent index
    private int getParent(int index) {
        return (index - 1) / 2;
    }

    // Get left child index
    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    // Get right child index
    private int getRightChild(int index) {
        return 2 * index + 2;
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Heapify up (used after insertion)
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = getParent(index);
            if (heap[parent] > heap[index]) {
                swap(parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    // Heapify down (used after deletion)
    private void heapifyDown(int index) {
        int minIndex = index;
        int leftChild = getLeftChild(index);
        int rightChild = getRightChild(index);

        if (leftChild < size && heap[leftChild] < heap[minIndex]) {
            minIndex = leftChild;
        }

        if (rightChild < size && heap[rightChild] < heap[minIndex]) {
            minIndex = rightChild;
        }

        if (minIndex != index) {
            swap(index, minIndex);
            heapifyDown(minIndex);
        }
    }

    // Insert a new element
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    // Remove and return the minimum element
    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        if (size > 0) {
            heapifyDown(0);
        }

        return min;
    }

    // Get minimum element without removing it
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    // Check if heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get current size of heap
    public int getSize() {
        return size;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        // Insert some values
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(7);
        minHeap.insert(1);
        minHeap.insert(9);
        System.out.println(Arrays.toString(minHeap.heap));

        // Print minimum elements one by one
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.extractMin() +" ");
        }
    }
}
