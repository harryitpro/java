package algorithms.array.dynamicprogramming;

import java.util.Arrays;

/**
 * Longest Increasing Subsequence (LIS)
 * The Longest Increasing Subsequence (LIS) of an array is the longest subsequence where elements are in increasing order.
 * <p>
 * Example
 * Input:  nums = [10, 9, 2, 5, 3, 7, 101, 18]
 * Output: 4
 * Explanation: The LIS is [2, 3, 7, 101]
 */
public class LongestIncreasingSubsequence {


    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // dp[i] represents the length of LIS ending at index i
        int[] dp = new int[nums.length];
        // Initialize all positions to 1 (each number is a subsequence of length 1)
        Arrays.fill(dp, 1);
        int maxLength = 1;

        // For each position i
        for (int i = 1; i < nums.length; i++) {
            // Check all previous positions j
            for (int j = 0; j < i; j++) {
                // If we can append nums[i] to subsequence ending at j
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution.lengthOfLIS(nums1));  // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(solution.lengthOfLIS(nums2));  // Output: 4

        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(solution.lengthOfLIS(nums3));  // Output: 1
    }
}
