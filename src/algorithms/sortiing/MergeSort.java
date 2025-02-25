package algorithms.sortiing;

import java.util.Arrays;

public class MergeSort {
    private static int[] aux;

    public static void sort(int[] arr) {
        aux = new int[arr.length];
        //start initial method call
        mergeSort(arr, 0, arr.length - 1);
    }

    //recursive method for merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        //base condition. returning condition
        if (left >= right) return;

        //divide to small same problem to resolve using recursion
        // Recursively sort the two halves by calling method itself
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // Merge the sorted halves. the main process
        merge(arr, left, mid, right);

        //implicit return
    }

    //merge 2 ordered array to make a large sorted array
    static void merge(int[] arr, int left, int mid, int right) {
        //populate aux array
        for (int i = left; i <= right; i++) {
            aux[i] = arr[i];
        }

        // Merge left and right sub array back into original array
        int leftIndex = left, rightIndex = mid + 1;
        for (int i = left; i <= right; i++) {
            if (leftIndex > mid) arr[i] = aux[rightIndex++];
            else if (rightIndex > right) arr[i] = aux[leftIndex++];
            else if (aux[leftIndex] < aux[rightIndex]) arr[i] = aux[leftIndex++];
            else if (aux[leftIndex] > aux[rightIndex]) arr[i] = aux[rightIndex++];
        }

        //complete merge, return
    }


    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

