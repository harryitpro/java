package algorithms.fundamental;

import java.util.Arrays;

/**
 * repeatedly swaps adjacent elements if they are in the wrong order. It continues until the entire array is sorted.
 *
 * How Bubble Sort Works
 * Compare adjacent elements.
 * Swap if they are in the wrong order.
 * Repeat for the next pair until the largest element bubbles up to the end.
 * Reduce the problem size and repeat until sorted.
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        //outer loop, index from 0(inclusive) to n-1()
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 8]
    }
}

/**
 * 🔹 Time Complexity: O(n²)
 * 🔹 Space Complexity: O(1) (In-place sorting)
 */