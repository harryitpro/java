package practice.algorithm;

import java.util.Arrays;

/**
 * merge 2 sorted array
 * example input
 * int[] a = {1, 2, 3, 5, 7, 8, 9};
 * int[] b = { 2,3, 3, 4, 6, 6, 10};
 * output:
 * [1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 9, 10]
 */
public class MergeTwoSortedArray {
    static int[] merge(int[] a, int[] b) {
        int[] s = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) s[k++] = a[i++];
            else s[k++] = b[j++];
        }
        while (i < a.length) s[k++] = a[i++];
        while (j < b.length) s[k++] = b[j++];
        return s;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 8, 9};
        int[] b = {2, 3, 3, 4, 6, 6, 10};
        System.out.println(Arrays.toString(merge(a, b)));
        //output:[1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 8, 9, 10]
    }
}
