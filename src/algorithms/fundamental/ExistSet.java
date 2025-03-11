package algorithms.fundamental;

import java.util.*;

//use Set to verify whether an element exists or not.
public class ExistSet {
    Set<Integer> getSet(int[] arr) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i : arr) {
            numberSet.add(i);
        }
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
        Set<String> stringSet = new HashSet<>();
        for (String s : arr) {
            stringSet.add(s);
        }
        return stringSet;
    }
}
