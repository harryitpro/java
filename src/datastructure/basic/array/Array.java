package datastructure.basic.array;

import java.util.Arrays;

/**
 * Store a collection of items of the same type
 */
public class Array {

    void init() {
        //initialization using literal
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.println("intArr = " + Arrays.toString(intArr)); //[1, 2, 3, 4, 5]

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        System.out.println("days = " + Arrays.toString(days)); //[Sunday, Monday, Tuesday, Wednesday]

        //declare and instantiate
        char[] chars = new char[]{'a', 'b', 'c'};
        System.out.println("chars = " + Arrays.toString(chars)); //[a, b, c]

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
    }

    void update() {
        //Access Element at O(1) time
        int[] arr = {10, 20, 30};
        arr[1] = 40;
        System.out.println(arr[1]); //40
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
    }
}
