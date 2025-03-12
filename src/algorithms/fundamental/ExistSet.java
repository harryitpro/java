package algorithms.fundamental;

import java.util.*;

//use Set to verify whether an element exists or not.
public class ExistSet {
    Set<Integer> getSet(int[] arr) {
        Set<Integer> numberSet = new HashSet<>();
        Arrays.stream(arr).forEach(i -> numberSet.add(i));
        return numberSet;
    }

    Set<Character> getSet(char[] arr) {
        Set<Character> charSet = new HashSet<>();
        for (char c : arr) {
            charSet.add(c);
        }
        return charSet;
    }

    Set<String> getSet(String[] arr) {
        Set<String> set = new HashSet<>();
        Arrays.stream(arr).forEach(s -> set.add(s));
        return set;
    }
}
