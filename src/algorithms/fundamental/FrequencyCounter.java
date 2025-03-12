package algorithms.fundamental;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Character, Integer> countEachFrequency(char[] arr) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : arr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static Map<Character, Integer> countEachFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
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
}
