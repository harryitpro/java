package algorithms.array.leetcode;

//Intersection of Two Arrays II

import java.util.Arrays;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 */
public class IntersectionOfTwoArrays {
    //frequency counter dictionary (freq) solution
    public int[] intersect(int[] nums1, int[] nums2) {
        //build int frequency map for both
        //pick the small array, iterate its map keys, and get its matching keys in bigger map.
        //contains result in the result map, and output the result
        return null;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result)); //[2,2]
    }
}
