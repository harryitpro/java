package algorithms.array;

import java.util.*;

/**
 * Find duplicated numbers in an array
 */
public class DuplicationCheck {

    //time complexity: n(log(n))
    static Set<Integer> findDuplicates_sort(int[] arr) {
        if (arr.length <= 1) return null;

        Set<Integer> duplicates = new HashSet<>();
        Arrays.sort(arr); //n(log(n)
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                duplicates.add(num);
            } else {
                num = arr[i];
            }
        }
        return duplicates;
    }

    //time complexity: O(n)
    static Set<Integer> findDuplicates_set(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!visited.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 1, 3, 6, 4};
        Set<Integer> duplicates = findDuplicates_sort(arr);
        System.out.println(duplicates);

        duplicates = findDuplicates_set(arr);
        System.out.println(duplicates);
    }
}
