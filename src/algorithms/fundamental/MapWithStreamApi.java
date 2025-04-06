package algorithms.fundamental;

import java.util.*;

/**
 * Key points when using Map with Stream API:
 *
 * Use entrySet().stream() to process key-value pairs
 * Use keySet().stream() to process keys only
 * Use values().stream() to process values only
 * Collectors.toMap() is useful for collecting stream results back into a Map
 * Maps don't maintain order unless using LinkedHashMap or TreeMap
 * Stream operations on Maps are lazy and can be chained
 */
public class MapWithStreamApi {
    static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> sortedMap.put(e.getKey(), e.getValue()));

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("Apple", 2);
        fruitPrice.put("Banana", 3);
        fruitPrice.put("Cherry", 1);
        System.out.println("Before: " + fruitPrice); //{Apple=2, Cherry=1, Banana=3}

        List list = new ArrayList(fruitPrice.entrySet());

        Map<String, Integer> sortedMap = sortByValue(fruitPrice);
        System.out.println("After: " + sortedMap); //{Cherry=1, Apple=2, Banana=3}
    }
}
