package algorithms.array.slidingwindow;

import java.util.Arrays;

/**
 * remove duplicate from sorted array.
 * return unique elements number
 */
class CountUniqueOfSortedArray {
    public static int removeDuplicates(int[] nums) {
        //init array pointer from 0 to length
        int left = 0, N = nums.length;
        //two pointers: left: keep the latest unique element position, right: current element pointer
        //iterate array, stop when right == N (as right is bigger than left, no need to verify left)
        for (int right = left + 1; right < N; right++) {
            //check loop using while loop, to continue moving right pointer till end or not duplicate
            while (right < N && nums[right] == nums[left]) {
                right++;
            }
            //reach to N? otherwise meet a new element. keep looping
            if (right < N) {
                nums[++left] = nums[right];
            }
        }
        //size is the latest left pointer index +1;
        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int value = removeDuplicates(arr);
        System.out.println(value); //expected 4
        System.out.println(Arrays.toString(arr)); //expected 4
    }
}
