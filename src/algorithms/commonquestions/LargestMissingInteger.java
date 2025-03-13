package algorithms.commonquestions;

import java.util.HashSet;
import java.util.Set;

public class LargestMissingInteger {
    public static int findLargestMissing(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int max = 0;

        // Add positive numbers to the set and find the max
        for (int num : nums) {
            if (num > 0) {
                numSet.add(num);
                max = Math.max(max, num);
            }
        }

        if (numSet.size() == max) { //no gap
            return max + 1;
        }

        // Start from max - 1 and go downward to find the largest missing number
        for (int i = max - 1; i > 0; i--) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return max + 1;  // If all numbers from 1 to max exist, return 1
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};  // Expected output: 6
        System.out.println(findLargestMissing(nums));
    }
}

