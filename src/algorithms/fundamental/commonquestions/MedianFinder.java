package algorithms.fundamental.commonquestions;


/**
 * To find the median from an unsorted array in Java, you need to:
 * <p>
 * Sort the array (O(n log n) time complexity).
 * Apply the median formula:
 * If the number of elements is odd, return the middle element.
 * If the number of elements is even, return the average of the two middle elements.
 */
public class MedianFinder {
    //find the median of sorted numbers


    public static void main(String[] args) {
        int[] sortedArray1 = {1, 3, 5, 7, 9};
        System.out.println("Median: " + findMedian(sortedArray1)); // Output: 5

        int[] sortedArray2 = {2, 4, 6, 8, 10, 12};
        System.out.println("Median: " + findMedian(sortedArray2)); // Output: 7.0
    }

    private static double findMedian(int[] sortedArray1) {
        return 0;
    }


    /**
     * Optimized Approach for Large Data (O(n) using QuickSelect)
     * If you only need the median without full sorting, you can use the QuickSelect algorithm (O(n) on average), which is a modified version of QuickSort that only finds the K-th smallest element.
     */

}
