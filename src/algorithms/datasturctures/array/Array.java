package algorithms.datasturctures.array;

import java.util.Arrays;

/**
 * Store a collection of items of the same type.
 * fixed size.
 * index: starting from 0;  last index is 0 + offset. (the offset is array's length -1)
 * length property of an array. arr.length (compare to String instance, s.length() method)
 */
public class Array {

    //C of CRUDE
    void init() {
        //initialization using literal
        int[] arr = {1, 2, 3, 4, 5};
        char[] chars = new char[]{'a', 'b', 'c'};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday"};

        //New
        int[] arrWithCapacity = new int[3];
        arrWithCapacity[0] = 1;
        arrWithCapacity[1] = 2;
        arrWithCapacity[2] = 3;

        //2 -dimensional array. row/columns are inferred
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 6}
        };

        System.out.println("arr = " + Arrays.toString(arr)); //[1, 2, 3, 4, 5]
        System.out.println("days = " + Arrays.toString(days)); //[Sunday, Monday, Tuesday, Wednesday]
        System.out.println("chars = " + Arrays.toString(chars)); //[a, b, c]
        //declare and instantiate using literals
        //declare with give size, and update
        System.out.println(Arrays.toString(arrWithCapacity));
        System.out.println("matrix = ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        //[1, 2, 3]
        //[2, 4, 6]
    }

    //access through index
    //Access Element at O(1) time, array[index]
    static void accessAndUpdate() {
        int[] arr = {10, 20, 30};
        System.out.println("array = " + arr[1]); //20
        arr[1] = 40;
        System.out.println(Arrays.toString(arr)); //{10, 20, 40}

    }

    //index start from 0, the last index is length-1
    static void iterate() {
        int[] array = {10, 20, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); //10.20
        }
    }

    static boolean equals(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));//false
        System.out.println("arr1.equals(arr2) : " + arr1.equals(arr2)); //false
        System.out.println("Arrays.equals(arr1,arr2) = " + equals(arr1, arr2)); //true
    }
}
