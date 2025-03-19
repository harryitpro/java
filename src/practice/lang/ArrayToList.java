package practice.lang;

import java.util.Arrays;
import java.util.List;

/**
 * Demo Arrays.asList() with a list numbers.
 */
public class ArrayToList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.forEach(n -> System.out.print(n + " ")); //1 2 3 4 5 6 7 8
    }
}
