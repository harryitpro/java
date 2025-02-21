package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task: Given an Array of integers, and fixed size of 4, get the max sum of contiguous subarray.
 */
public class MaxSumSubarray {

    //Brute Force solution
    //do we need the Key,as a counter question?
    //to get hands dirty
    private static int maxSumSubarray(int[] arr, int k) {
        //get all the sub-arrays of original array, put them into a map Map<int[],int> array_sum
        //iterate every sub array, compute the sum.   //compute to the sum
        //select the max sum, and return the sum value.  //sorting to get the maximum?
        List<int[]> subArrays = getAllSubArrays(arr, k);


        return 0;
    }

    private static List<int[]> getAllSubArrays(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            list.add(Arrays.copyOfRange(arr, i, i + k));
        }
        for (int[] subArr : list) {
            System.out.println(Arrays.toString(subArr));
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        maxSumSubarray(arr, k);
//        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));

        /**
         * First window ([1, 4, 2, 10]): Sum = 17
         * Slide to next ([4, 2, 10, 23]): Sum = 39 (add 23, remove 1)
         * Slide to next ([2, 10, 23, 3]): Sum = 38
         * And so on...
         * Output: Maximum sum of subarray of size 4: 39
         */
    }
}
