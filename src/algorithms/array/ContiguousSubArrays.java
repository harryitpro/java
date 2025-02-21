package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContiguousSubArrays {
    static void getAllContiguousSubArrays(int[] arr, int k) {
        if (k > arr.length) {
            throw new IllegalArgumentException("sub array size is bigger than original array size");
        }
        for (int i = 0; i + k - 1 <= arr.length - 1; i++) {
            int[] subArr = Arrays.copyOfRange(arr, i, i + k);
            System.out.println(Arrays.toString(subArr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int size = 3;
        getAllContiguousSubArrays(arr, size);
        /**
         * [0, 1, 2]
         * [1, 2, 3]
         * [2, 3, 4]
         * [3, 4, 5]
         * [4, 5, 6]
         */
    }
}
