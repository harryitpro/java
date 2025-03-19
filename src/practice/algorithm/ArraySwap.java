package practice.algorithm;

public class ArraySwap {
    //Signature: swap value of i and j for an int array
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
