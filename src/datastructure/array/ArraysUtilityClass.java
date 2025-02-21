package datastructure.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Arrays factory methods.
 * Arrays.toString() : list each element in string.
 * Arrays.sort()
 * Arrays.binarySearch()
 * Arrays.asList()
 * Arrays.stream()
 */
public class ArraysUtilityClass {

    //sorting array
    static void sort() {
        int[] arr = {2, 1, 3, 5, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
    }

    //binarySearch on sorted array
    static void binarySearch() {
        int[] arr = {1, 2, 3, 4, 5};  //sorted array
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index); // 4
    }

    //convert array to List
    static void asList() {
        //convert String object array to String list
        String[] fruits = {"Apple", "Banana", "Cherry"};
        List<String> fruitList = Arrays.asList(fruits);

        //convert Integer array to Integer List
        Integer[] arr = {2, 1, 3, 5, 4};
        List<Integer> integerList = Arrays.asList(arr);

        //convert primitive literal array to Integer List. note the literal has no {} surrounded
        List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5);
    }

    //array Stream
    static void stream() {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        Stream<String> fruitStream = Arrays.stream(fruits);

        List<String> aFruits = fruitStream
                .filter((value) -> value.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(aFruits.toString()); // [Apple]

        List<String> fruitsWithPrefix = Arrays.stream(fruits)
                .map(fruit -> fruit.charAt(0) + "_" + fruit)
                .collect(Collectors.toList());
        System.out.println(fruitsWithPrefix.toString()); // A_Apple, B_Banana, C_Cherry]
    }

    //copy subarray
    //contiguous subarray of size k

    /**
     * 1: get all sub-arrays and calculate sum: Arrays.copyOfRange():  Time Complexity: K * n.length
     * 2, get max of sum.
     */
    static void subArray() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int[] subArr = Arrays.copyOfRange(arr, i, i + k);
            int sum = Arrays.stream(subArr).sum();
            if (sum > max) {
                max = sum;
            }
            System.out.println(Arrays.toString(subArr));
        }
        System.out.println("max sum = " + max);
    }

    public static void main(String[] args) {
        binarySearch();
        stream();
        System.out.println("-------subArray()------");
        subArray();
    }
}
