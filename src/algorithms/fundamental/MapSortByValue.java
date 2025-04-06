package algorithms.fundamental;

import java.util.*;

public class MapSortByValue {
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

        Map<String, Integer> sortedMap = sortByValue(fruitPrice);
        System.out.println("After: " + sortedMap); //{Cherry=1, Apple=2, Banana=3}
    }
}
