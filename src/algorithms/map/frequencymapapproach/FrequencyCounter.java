package algorithms.map.frequencymapapproach;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Character, Integer> countEachFrequency(char[] arr) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : arr) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }

    public static Map<Integer, Integer> countEachFrequency(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        return countMap;
    }

    public static Map<String, Integer> countEachFrequency(String[] arr) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        return countMap;
    }
}
