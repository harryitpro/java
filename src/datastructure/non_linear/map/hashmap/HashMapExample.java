package datastructure.non_linear.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Method	Description
 * put(K key, V value)	Adds or updates a key-value pair
 * get(K key)	Retrieves the value for a key
 * remove(K key)	Removes a key-value pair
 * containsKey(K key)	Checks if the key exists
 * containsValue(V value)	Checks if a value exists
 * size()	Returns the number of elements
 * isEmpty()	Checks if the map is empty
 * clear()	Removes all entries
 * replace(K key, V value)	Replaces the value of a key
 * putIfAbsent(K key, V value)	Adds only if key does not exist
 * compute(K key, BiFunction)	Updates value based on old value
 * computeIfAbsent(K key, Function)	Adds only if key is missing
 * computeIfPresent(K key, BiFunction)	Modifies only if key exists
 */
public class HashMapExample {
    void put(String k, Integer value) {
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent(k, 0);
        map.put(k, map.get(k) + value);
    }
}
