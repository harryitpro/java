package algorithms.sortiing;

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

/**
 * In the QuickSort algorithm, the partition step is crucial because it divides the array into two parts: one part with elements smaller than a chosen pivot and another part with elements larger than the pivot. This helps in recursively sorting the subarrays on each side of the pivot.
 *
 * Partitioning in QuickSort
 * Choose a Pivot:
 *
 * In QuickSort, the pivot can be chosen in various ways:
 * The first element
 * The last element
 * A random element
 * The median of the array The choice of the pivot affects the algorithm’s performance, but in the partitioning step, we will assume that we’ve selected a pivot.
 * Rearrange the Array:
 *
 * After selecting the pivot, the goal of the partition function is to rearrange the elements in the array so that:
 * Elements smaller than the pivot come before it.
 * Elements larger than the pivot come after it.
 * The pivot itself should end up in its correct sorted position.
 * Steps in Partitioning:
 * Initialization:
 * Set a variable i (initially pointing to the element before the first element in the array).
 * Traverse the Array:
 * Iterate through the array with another index j from the first element to the second-to-last element (the pivot element is excluded from this iteration).
 * For each element arr[j]:
 * If arr[j] < pivot, increment i and swap arr[i] and arr[j].
 * If arr[j] >= pivot, just continue without changing anything.
 * Place the Pivot in its Correct Position:
 * After the iteration, i will point to the last element smaller than the pivot. Swap the pivot with the element at i+1.
 * Return the Pivot's Index:
 * The pivot is now in its correct position in the sorted array, and its index is returned so the QuickSort algorithm can recursively sort the subarrays on the left and right of the pivot.
 */