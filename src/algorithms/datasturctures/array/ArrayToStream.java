package algorithms.datasturctures.array;

import java.util.stream.*;
import java.util.*;

/**
 * convert an array to a Stream using Arrays.stream() or Stream.of()
 * Summary
 * Conversion Method	Works With	Best Use Case
 * Arrays.stream(array)	Objects & Primitives	Converting full or partial arrays
 * Stream.of(array)	Objects only	Simplicity for object arrays
 * Arrays.stream(primitiveArray)	Primitives (int[], double[])	Specialized streams like IntStream
 * Arrays.stream(array, start, end)	Objects & Primitives	Partial array to stream
 */
public class ArrayToStream {
    //convert a String (object) array to a stream,
    //using Arrays.stream static method
    public static void stringToStreamArrays() {
        String[] days = {"sunday", "Monday", "Tuesday"};
        Stream<String> stream = Arrays.stream(days);
        stream.forEach(System.out::println);
    }

    public static void stringToStream_Stream() {
        String[] days = {"sunday", "Monday", "Tuesday"};
        Stream<String> stream = Stream.of(days);
        stream.forEach(System.out::println);
    }

    //Iterate: R of CRUDE
    void iterateByStream() {
        int[] arr = {10, 20, 30};
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        stringToStreamArrays();
        stringToStream_Stream();
    }

}
