package algorithms.algorithms.basic;


/**
 * To find the median from an unsorted array in Java, you need to:
 * <p>
 * Sort the array (O(n log n) time complexity).
 * Apply the median formula:
 * If the number of elements is odd, return the middle element.
 * If the number of elements is even, return the average of the two middle elements.
 */
import java.util.Arrays;

public class FindMedian {

    public static double findMedian(int[] nums) {
        Arrays.sort(nums); // Sort in ascending order
        int n = nums.length;
        if (n % 2 == 1) {
            return nums[n / 2]; // Odd length → middle element
        } else {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0; // Even → avg of middle two
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1, 2, 4};
        int[] arr2 = {7, 1, 3, 4};

        System.out.println("Median of arr1: " + findMedian(arr1)); // 3
        System.out.println("Median of arr2: " + findMedian(arr2)); // (3+4)/2 = 3.5
    }
}

