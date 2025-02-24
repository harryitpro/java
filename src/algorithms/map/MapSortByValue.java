package algorithms.map;

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
    static void sortMapByValue() {
        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("Apple", 2);
        fruitPrice.put("Banana", 3);
        fruitPrice.put("Cherry", 1);

        //sort fruit by price. put sorted map into LinkedHashMap, which maintain the order of insertion
        List<Map.Entry<String, Integer>> list = new ArrayList<>(fruitPrice.entrySet());

        list.sort(Map.Entry.comparingByValue());
    }
}
