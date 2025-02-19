package datastructure.fundamentalunit;

import java.util.Arrays;

/**
 * Store a collection of items of the same type.
 * fixed size.
 * index: starting from 0;  last index is 0 + offset. (the offset is array's length -1)
 */
public class Array {

    void init() {
        //initialization using literal
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println("intArr = " + Arrays.toString(intArr)); //[1, 2, 3, 4, 5]

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        System.out.println("days = " + Arrays.toString(days)); //[Sunday, Monday, Tuesday, Wednesday]

        //declare and instantiate using literals
        char[] chars = new char[]{'a', 'b', 'c'};
        System.out.println("chars = " + Arrays.toString(chars)); //[a, b, c]

        //declare with give size, and update
        int[] intArrWithCapacity = new int[3];
        intArrWithCapacity[0] = 1;
        intArrWithCapacity[1] = 2;
        intArrWithCapacity[2] = 3;
        System.out.println(Arrays.toString(intArrWithCapacity));

        //2 -dimensional array. row/columns are inferred
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 6}
        };

        System.out.println("matrix = ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        //[1, 2, 3]
        //[2, 4, 6]
    }


    //access through index
    void access() {
        //Access Element at O(1) time, array[index]
        int[] intArray = {10, 20, 30};
        System.out.println("intArray = " + intArray[1]); //20
    }

    void iterate() {
        int[] intArray = {10, 20, 30};
        for (int value : intArray) {
            System.out.println(value); //20
        }

        //index start from 0, the last index is length-1
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]); //20
        }
    }

    void traverseWithRange() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};  //7 elements
        //traverse from start to a range of 4: start = 0; length= 4.  (startIndex, startIndex+range-1)
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }

    void update() {
        //Access Element at O(1) time
        int[] arr = {10, 20, 30};
        arr[1] = 40;
        System.out.println(arr[1]); //40
    }

    static int sum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array is empty or null");
        }
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return sum;
    }

    static int max(int[] arr) {
        //empty or null check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        //init place-holder value to the first one
        int max = arr[0];

        //compare and compute
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        //return value
        return max;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        System.out.println("---arr.init()---");
        arr.init();

        System.out.println("---arr.access()---");
        arr.access();

        System.out.println("---arr.iterate()---");
        arr.iterate();

        System.out.println("---arr.update()---");
        arr.update();

        System.out.println("---arr.traverseWithRange()---");
        arr.traverseWithRange();

        System.out.println("---max()---");
        int[] intArr = {3, 1, 2, 5, 4};
        int max = max(intArr);
        System.out.println("max = " + max); //5

        intArr = new int[]{1, 2, 3, 4, 5};
        int sum = sum(intArr);
        System.out.println("sum(arr) = " + sum(intArr));//15

        int[] emptyArr = new int[]{};
        // Exception in thread "main" java.lang.IllegalArgumentException: array is empty or null
        try {
            System.out.println("sum(emptyArr) = " + sum(emptyArr));
        } catch (Exception e) {
            //skip exception
        }
    }
}
