package datastructure.basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAlgorithms {
    static List<int[]> getAllContiguousSubArrays(int[] arr, int k) {
        List<int[]> list = new ArrayList<>();
        int max = arr.length;
        if (k > max) {
            throw new IllegalArgumentException("sub array size is bigger than original array size");
        }
        for (int i = 0; i + k - 1 <= arr.length - 1; i++) {
            int[] subArr = Arrays.copyOfRange(arr, i, i + k);
            list.add(subArr);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int size = 3;
        List<int[]> subArrays = getAllContiguousSubArrays(arr, size);
        for (int[] subArr : subArrays) {
            System.out.println(Arrays.toString(subArr));
        }
    }
}
