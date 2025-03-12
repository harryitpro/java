package algorithms.datasturctures.basic;

import java.util.*;

/**
 * Here's a Java implementation of a Binary Heap (Min-Heap and Max-Heap).
 * <p>
 * A Binary Heap is a complete binary tree that satisfies the heap property:
 * <p>
 * Min-Heap: Parent node is smaller than or equal to its children.
 * Max-Heap: Parent node is larger than or equal to its children.
 */
public class ArrayMinHeap {
    private int[] heap;
    private int capacity;
    private int rear;
    private int size;

    // Constructor
    public ArrayMinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.rear = -1;
        this.size = 0;
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

    // Check if heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get current size of heap
    public int getSize() {
        return size;
    }

    // offer a new element
    public void offer(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }

        heap[++rear] = value;
        heapifyUp(rear);
        size++;
    }

    // Heapify up (used after offerion)
    //swim
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

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Remove and return the minimum element
    public int poll() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int min = heap[0];
        heap[0] = heap[rear--];
        size--;

        if (size > 0) {
            heapifyDown(0);
        }

        return min;
    }

    // Heapify down (used after deletion)
    private void heapifyDown(int index) {
        int minIndex = index;
        int leftChild = getLeftChild(index);
        int rightChild = getRightChild(index);

        if (leftChild < size && heap[leftChild] < heap[minIndex]) {
            minIndex = leftChild;
        } else if (rightChild < size && heap[rightChild] < heap[minIndex]) {
            minIndex = rightChild;
        } else {
            return;
        }

        swap(index, minIndex);
        //go to subtree, continue sink
        heapifyDown(minIndex);
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        ArrayMinHeap minHeap = new ArrayMinHeap(10);

        // insert some values
        minHeap.offer(5);
        minHeap.offer(3);
        minHeap.offer(7);
        minHeap.offer(1);
        minHeap.offer(9);
        System.out.println(Arrays.toString(minHeap.heap)); //[1, 3, 7, 5, 9, 0, 0, 0, 0, 0]

        // Print minimum elements one by one
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");  //1 3 5 7 9
        }
    }
}
