package algorithms.fundamental.frequencycounter;

import java.util.*;

public class FrequencyCounter {
    public static Map<Character, Integer> countEachFrequency(char[] arr) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : arr) freq.put(c, freq.getOrDefault(c, 0) + 1);
        return freq;
    }

    public static Map<Character, Integer> countEachFrequency(String s) {
        return countEachFrequency(s.toCharArray());
    }

    public static Map<Integer, Integer> countEachFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Arrays.stream(arr).forEach(i -> freq.put(i, freq.getOrDefault(i, 0) + 1));
        return freq;
    }

    public static Map<String, Integer> countEachFrequency(String[] arr) {
        Map<String, Integer> freq = new HashMap<>();
        Arrays.stream(arr).forEach(s -> freq.put(s, freq.getOrDefault(s, 0) + 1));
        return freq;
    }

    public static int[] countEachCharFrequency(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c] = freq[c] + 1;
        }
        return freq;
    }

    public static Set<Integer> toUniqueSet(int[] arr) {
        Set<Integer> numberSet = new HashSet<>();
        Arrays.stream(arr).forEach(i -> numberSet.add(i));
        return numberSet;
    }

    public static Set<Character> toUniqueSet(char[] arr) {
        Set<Character> charSet = new HashSet<>();
        for (char c : arr) {
            charSet.add(c);
        }
        return charSet;
    }

    public static Set<String> toUniqueSet(String[] arr) {
        Set<String> set = new HashSet<>();
        Arrays.stream(arr).forEach(s -> set.add(s));
        return set;
    }

    public static void main(String[] args) {
        String s = "This is CharFrequencyCounter app";
        System.out.println(countEachCharFrequency(s)[84]); //1  "T"  occurs 1
    }
}
