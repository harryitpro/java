package algorithms.fundamental;

import java.util.*;
import java.lang.Integer;

/**
 * Common Methods in Map API
 * Method	Description
 * put(K key, V value)	Adds a key-value pair.
 * get(K key)	Retrieves value by key.
 * remove(K key)	Removes an entry by key.
 * containsKey(K key)	Checks if a key exists.
 * containsValue(V value)	Checks if a value exists.
 * keySet()	Returns all keys as a Set<K>.
 * values()	Returns all values as a Collection<V>.
 * entrySet()	Returns all key-value pairs as a Set<Map.Entry<K,V>>.
 * forEach(BiConsumer<K,V>)	Iterates through entries (Java 8+).
 * <p>
 * Map Stream
 */
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
