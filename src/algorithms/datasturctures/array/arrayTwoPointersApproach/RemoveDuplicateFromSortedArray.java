package algorithms.datasturctures.array.arrayTwoPointersApproach;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    /**
     * remove duplicated elements from a sorted array IN-Place (no extra data structure is needed)
     *
     * @param arr: sorted int array
     * @return the number of unique elements
     */

    //Key Question: how to check duplicates for a sorted array?
    //Solution: use 2 pointers, left pointer to the latest unique element, compare element to its right side(using right pointer) till a different element is found.
    //then move left one step(if update is needed), update value with the arr[right].
    //loop the check till right reaches to the end.
    static int removeDuplicateFromSortedArray(int[] arr) {
        int uniqueCount = 0;
        int N = arr.length;
        int left = 0;
        for (int right = left; right < N; right++) {
            uniqueCount++;
            //check duplicate in inner loop, stop when right reaches to N, or different value is found
            while (right < N && arr[right] == arr[left]) {
                right++;
            }
            if (right < N) {
                arr[++left] = arr[right];
            }
        }
        //fill in all the rest to left pointer to -1
        Arrays.fill(arr, ++left, N, -1);
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5};
        int uniques = removeDuplicateFromSortedArray(arr);
        System.out.println("unique: " + uniques); //5
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, -1, -1, -1, -1]
    }
}
