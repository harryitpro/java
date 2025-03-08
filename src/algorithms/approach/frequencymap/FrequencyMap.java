package algorithms.approach.frequencymap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static Map<Character, Integer> getCountMap(char[] arr) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : arr) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }

    public static Map<Integer, Integer> getCountMap(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        return countMap;
    }

    public static Map<String, Integer> getCountMap(String[] arr) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : arr) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }
        return countMap;
    }
}
