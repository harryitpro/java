package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find all contiguous subarrays of an array
 */
public class ContiguousSubArrays {
    /**
     * To find all contiguous subarrays of an array, we generate all possible subarrays using nested loops. Here’s how:
     * Approach:
     * Use two loops:
     * The outer loop picks the starting index.
     * The inner loop picks the ending index, forming subarrays.
     * Extract and print each subarray.
     * Time Complexity: the time complexity is O(n²).
     */
    static List<char[]> findAllContiguousSubArrays(char[] arr) {
        List<char[]> subArrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                subArrays.add(Arrays.copyOfRange(arr, i, j + 1));
            }
        }
        return subArrays;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        List<char[]> subs = findAllContiguousSubArrays(arr);
        for (char[] sub : subs)
            System.out.println(sub);
    }
}
