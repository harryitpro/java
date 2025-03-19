package practice.algorithm;

/**
 * given a sorted array of integers and a key value, return the first index of searching result, and -1 if not found
 * condition: array does not contain duplicated numbers.
 */
public class BinarySearchUniqueKey {
    public static int binarySearch(int[] arr, int key) {
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8};
        System.out.println(binarySearch(arr, 3));  //expecting 3
    }
}
