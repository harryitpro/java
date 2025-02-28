package datastructure.heap;

import java.util.Arrays;

public class MaxHeap {
    int[] heap;
    int capacity;
    int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int getParent(int i) {
        return i / 2;
    }

    public int getLeftChild(int i) {
        return 2 * i + 1;
    }

    public int getRightChild(int i) {
        return 2 * i + 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * Inserts the specified element into this priority queue.
     *
     * @param data
     */
    public void offer(int data) {
        if (isFull()) {
            throw new RuntimeException("heap is overflow");
        }
        heap[size] = data;
        heapifyUp(size);
        size++;
    }

    //swim up if element in current index is larger than its parent
    //stop when 1, the index is Zero(top)
    void heapifyUp(int index) {
        while (index > 0 && heap[index] > heap[getParent(index)]) {
            swap(index, getParent(index));
            index = getParent(index);
        }
    }

    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        if (!isEmpty()) {
            heapifyDown(0);
        }
        return max;
    }

    //sink if either child element is larger than current element.
    //and child index reaches the end of array. childIndex < size
    private void heapifyDown(int i) {
        int maxIndex = i;
        int leftChild = getLeftChild(i), rightChild = getRightChild(i);
        if (leftChild < size && heap[i] < heap[leftChild]) {
            maxIndex = leftChild;
        } else if (rightChild < size && heap[i] < heap[rightChild]) {
            maxIndex = rightChild;
        } else {
            return;
        }
        swap(i, maxIndex);
        heapifyDown(maxIndex);
    }


    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.offer(1);
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(3);
        maxHeap.offer(7);
        System.out.println(Arrays.toString(maxHeap.heap)); //[10, 7, 5, 3, 1, 0, 0, 0, 0, 0]

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
        /**
         * 10
         * 7
         * 3
         * 5
         * 1
         */
    }
}
