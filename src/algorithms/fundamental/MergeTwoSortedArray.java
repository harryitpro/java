package algorithms.fundamental;

import java.util.Arrays;

public class MergeTwoSortedArray {

    static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0;  //i: arr1 index, j: arr2 index

        for (int k = 0; k < merged.length; k++) {
            if (i == arr1.length) {
                merged[k] = arr2[j++];
            } else if (j == arr2.length) {
                merged[k] = arr1[i++];
            } else if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i++];
            } else {
                merged[k] = arr2[j++];
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 7, 8, 9};
        int[] arr2 = {2, 3, 3, 4, 6, 6, 10};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
        // output: [1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 9, 10]
    }
}
