package algorithms.fundamental.sort;

import java.util.*;
import java.lang.Integer;

public class MapSortByValue {
    static Map sortByValue(Map<String, Integer> map) {
        Map<String, Integer> result = new LinkedHashMap<>();

        //convert map to a list of Entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //sort list through list's instance sort method.
        list.sort(Map.Entry.comparingByValue());
        //put back sorted Entry to map
        list.forEach(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("Apple", 2);
        fruitPrice.put("Banana", 3);
        fruitPrice.put("Cherry", 1);
        System.out.println("Before: " + fruitPrice); //{Cherry=1, Apple=2, Banana=3}

        Map<String, Integer> sortedMap = sortByValue(fruitPrice);
        System.out.println("After: " + sortedMap); //{Cherry=1, Apple=2, Banana=3}
    }
}
