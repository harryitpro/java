package algorithms.fundamental;

import java.util.*;

/**
 * given an array of integers, return (all) indices of the two numbers that add up to a specific target
 */
public class TwoSum {
    static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        Map<Integer, Integer> valIndexMap = new HashMap<>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int complement = target - nums[i];
            if (valIndexMap.containsKey(complement)) {
                list.add(new int[]{i, valIndexMap.get(complement)});
            } else {
                valIndexMap.put(nums[i], i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<int[]> pairs = twoSum(nums, 9);
        for (int[] pair : pairs) {
            System.out.print(Arrays.toString(pair));  //[4, 3][5, 2][6, 1][7, 0]
        }
    }
}
