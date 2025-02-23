package datastructure.array.sortiing;

import java.util.Arrays;

/**
 * QuickSort is a divide-and-conquer sorting algorithm that is efficient for large datasets. It picks a pivot, partitions the array around it, and recursively sorts the subarrays.
 * <p>
 * 1. How QuickSort Works
 * Choose a Pivot (typically the last, first, or middle element). mark the position
 * Partition the array into:
 * put Elements less than pivot to (left side).
 * Pivot in its correct position.
 * Elements greater than pivot (right side).
 * Recursively sort the left and right partitions.
 */


//Quick sort is Partition Sort

/**
 * how the partition process works in Quick Sort, as it's the heart of the algorithm. I'll break it down step-by-step using the implementation from the previous example, where we use the last element as the pivot.
 * <p>
 * How Partition Works
 * The partition() method takes an array and rearranges it so that:
 * <p>
 * All elements less than or equal to the pivot are on the left side:
 * All elements greater than the pivot are on the right side
 * The pivot ends up in its final sorted position
 */
public class QuickSort {


    // Method to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array using the last element as pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main method to test the quick sort implementation
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:" + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}
