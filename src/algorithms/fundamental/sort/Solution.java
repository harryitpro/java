package algorithms.fundamental.sort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 9, 3, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        //expecting: [1,2,3,4,4,8,9]
    }

    static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        //base condition
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        //create auxillary arrays
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int leftIndex = 0, leftLength = leftArr.length;
        int rightIndex = 0, rightLength = rightArr.length;
        for (int i = left; i <= right; i++) {
            if (leftIndex >= leftLength)
                arr[i] = rightArr[rightIndex++];
            else if (rightIndex >= rightLength)
                arr[i] = leftArr[leftIndex++];
            else if (leftArr[leftIndex] < rightArr[rightIndex])
                arr[i] = leftArr[leftIndex++];
            else
                arr[i] = rightArr[rightIndex++];
        }
    }
}
