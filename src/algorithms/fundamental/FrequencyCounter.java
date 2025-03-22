package algorithms.fundamental;

import java.util.*;

public class FrequencyCounter {
    public static Map<Character, Integer> toFreqMap(char[] arr) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : arr) freq.put(c, freq.getOrDefault(c, 0) + 1);
        return freq;
    }

    public static Map<Integer, Integer> toFreqMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Arrays.stream(arr).forEach(i -> freq.put(i, freq.getOrDefault(i, 0) + 1));
        return freq;
    }

    public static Map<String, Integer> toFreqMap(String[] arr) {
        Map<String, Integer> freq = new HashMap<>();
        Arrays.stream(arr).forEach(s -> freq.put(s, freq.getOrDefault(s, 0) + 1));
        return freq;
    }

    public static int[] toFreqArray(String s) {
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

}
