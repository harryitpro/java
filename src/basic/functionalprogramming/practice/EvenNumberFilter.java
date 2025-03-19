package basic.functionalprogramming.practice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * /**
 * * task: Filter Even Numbers
 * * Functional Interface: Predicate<T>     Signature: boolean test(T t);
 * <p>
 * practice filter intermediate method of Stream.
 * Functional Interface: Predicate<? super T> predicate
 */
public class EvenNumberFilter {
    static List<Integer> findEvenNumbers(List<Integer> nums) {
        Predicate<Integer> predicate = i -> (i % 2 == 0);
        return nums.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNumbers = findEvenNumbers(numbers);
        for (Integer i : evenNumbers) {
            System.out.print(i + " ");
        }
    }
}
