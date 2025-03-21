package basic.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * task: sort a sequence of names based on length.
 * Functional Interface: Comparator<T>
 *  Signature: int compare(T o1, T o2);
 */

public class SortByLength {
    //anonymous method solution: assign a lambda expression to an functional interface
    static void sortByLengthLambda(List<String> names) {
        //assign a Lambda Expression to a functional interface
        Comparator<String> compareByLength = Comparator.comparingInt(String::length);
        names.sort(compareByLength);
    }

    //StreamAPI + lambda Expression Solution
    static List<String> sortByLengthStreamAPI(List<String> names) {
        Comparator<String> compareByLength = (o1, o2) -> o1.length() - o2.length();
        //lambda expression, anonymous method as an argument, passed to stream api
        List<String> sortedByLength =
                names.stream().sorted(compareByLength).collect(Collectors.toList());

        return sortedByLength;
    }

    //anonymous class solution
    static void sortByLength(List<String> names) {
        //traditional way, anonymous class
        Comparator<String> compareByLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        //call list.sort method by given functional interface/anonymous class
        names.sort(compareByLength);
    }

    //verify
    public static void main(String[] args) {
        {
            List<String> names = Arrays.asList("Bob", "Alice", "Tom");
            sortByLengthLambda(names);
            System.out.println(names.toString()); //"Bob","Tom", "Alice"
        }

        {
            List<String> names = Arrays.asList("Bob", "Alice", "Tom");
            List<String> sortedNames = sortByLengthStreamAPI(names);
            System.out.println(sortedNames.toString());
        }

        {
            List<String> names = Arrays.asList("Bob", "Alice", "Tom");
            sortByLength(names);
            System.out.println(names.toString()); //"Bob","Tom", "Alice"
        }
    }

}
