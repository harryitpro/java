package algorithms.fundamental;

/**
 * given a sorted array of integers and a key value, return the first index of searching result, and -1 if not found
 * condition: array does not contain duplicated numbers.
 */
public class BinarySearchUniqueKey {
    public static int binarySearch(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) lo = ++mid;
            else hi = --mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8};
        System.out.println(binarySearch(arr, 3));  //expecting 3
    }
}
