package algorithms.array;

import java.util.*;

/**
 * task: given an array of integers, list all contiguous subarray.
 */
public class SubArray {
    /**
     * solution:
     * 1, for a certain starting index, select different end index to generate a new sub array
     * 2, outer loop to pick the starting index.
     * 3, inner loop to pick end index
     */
    public static List<int[]> getAllSubArrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = 0; end < arr.length; end++) {

            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        List<int[]> allSubArrs = getAllSubArrays(arr);
        for (int[] subArr : allSubArrs) {
            System.out.println(Arrays.toString(subArr));
        }
    }
}
