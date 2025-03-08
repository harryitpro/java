package algorithms.array;

import java.util.Arrays;

class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = left + 1; right < nums.length; right++) {
            while (right < nums.length && nums[right] == nums[left]) {
                right++;
            }
            if (right < nums.length) nums[++left] = nums[right];
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int value = removeDuplicates(arr);
        System.out.println(value); //expected 4
        System.out.println(Arrays.toString(arr));
    }
}
