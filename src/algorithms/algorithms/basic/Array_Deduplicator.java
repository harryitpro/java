package algorithms.algorithms.basic;

import java.util.Arrays;

public class Array_Deduplicator {
    public static int distinctArrayInPlace(int[] arr) {
        // Handle edge cases
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (arr.length <= 1) {
            return arr.length; // Empty or single element: no duplicates
        }

        // Index to place the next unique element
        int positionIndex = 1;

        // Single pass through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                arr[positionIndex++] = arr[i];
        }

        // Fill remaining positions with a sentinel value (optional)
        for (int i = positionIndex; i < arr.length; i++) {
            arr[i] = -1;
        }

        return positionIndex;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
                {1, 2, 2, 2, 3, 4, 5, 5, 5},  // [1, 2, 3, 4, 5, -1, -1, -1, -1]
                {},                             // []
                {1},                            // [1]
                {1, 1, 1},                      // [1, -1, -1]
                {1, 2, 3, 4}                    // [1, 2, 3, 4]
        };

        for (int[] arr : testCases) {
            int[] arrCopy = arr.clone(); // Preserve original for printing
            int newLength = distinctArrayInPlace(arr);
            System.out.println("Input: " + Arrays.toString(arrCopy));
            System.out.println("New Length: " + newLength);
            System.out.println("Output: " + Arrays.toString(arr));
            System.out.println();
        }
    }
}

