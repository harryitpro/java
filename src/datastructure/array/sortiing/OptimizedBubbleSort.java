package datastructure.array.sortiing;

import java.util.Arrays;

/**
 * Stops Early if Already Sorted.
 * add a flag variable of swapped, to indicate whether a whole array is sorted.
 */
public class OptimizedBubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps happened, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Already sorted
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}

/**
 * 🔹 Best Case Complexity: O(n) (If already sorted)
 * 🔹 Worst Case Complexity: O(n²) (If reversed)
 */
