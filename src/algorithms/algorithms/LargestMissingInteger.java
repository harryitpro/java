package algorithms.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * find the largest missing integer within a given unsorted int array. or the max+1 if no gap
 * for example: int[] nums = {3, 7, 1, 2, 8, 4, 5};  // Expected output: 6
 */
public class LargestMissingInteger {

    //hint: HashSet<Integer> for existence tracking
    public static int solution(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        int max = 0;

        // Add positive numbers to the set to track number existence
        for (int num : nums) {
            if (num > 0) {
                exist.add(num);
                max = Math.max(max, num);
            }
        }

        if (exist.size() == max) { //no gap
            return max + 1;
        }

        // Start from max - 1 and go downward to find the largest missing number
        for (int i = max - 1; i > 0; i--) {
            if (!exist.contains(i)) {
                return i;
            }
        }

        return max + 1;  // If all numbers from 1 to max exist, return 1
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};  // Expected output: 6
        System.out.println(solution(nums));
    }
}

