package paradiam.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * task: Filter Even Numbers
 * Functional Interface: Predicate<T>
 * Signature: boolean test(T t);
 */
public class FilterEvenNumbers {
    static List<Integer> filterEvenNumbersLambda(List<Integer> numbers) {
        Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
        return numbers.stream().filter(evenNumberPredicate).collect(Collectors.toList());
    }

    //verify
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(filterEvenNumbersLambda(numbers).toString()); //[2, 4, 6, 8]
    }
}
