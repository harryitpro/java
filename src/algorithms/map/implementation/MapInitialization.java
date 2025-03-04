package algorithms.map.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * There are multiple ways to initialize a Map in Java, depending on the use case. Here are some common methods:
 * Method	Mutable?	Java Version	Best Use Case
 * put()	✅ Yes	Any	General use
 * Map.of()	❌ No	Java 9+	Small, fixed-size maps
 * Map.ofEntries()	❌ No	Java 9+	Large, fixed-size maps
 * Double Brace	✅ Yes	Any	Avoid due to memory issues
 * Stream API	❌ No	Java 8+	Functional programming
 * new HashMap<>(Map.of())	✅ Yes	Java 9+	Mutable map with initialization
 * <p>
 * <p>
 * map.put("Apple", 10);
 * map.put("Banana", 20);
 * map.put("Orange", 30);
 */
public class MapInitialization {

    //Mutable init a map
    static void put() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println(map); // Output: {Apple=10, Banana=20, Orange=30}
    }

    //Immutable,
    //Factory method,
    //entry pair literal
    static void OfStaticMethod() {
        Map<String, Integer> map = Map.of(
                "Apple", 10,
                "Banana", 20,
                "Orange", 30
        );
        System.out.println(map); // Output: {Apple=10, Banana=20, Orange=30}
    }

    static void ofEntriesStaticMethod() {
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("Apple", 10),
                Map.entry("Banana", 20),
                Map.entry("Cherry", 30)
        );
        System.out.println(map); // Output: {Apple=10, Banana=20, Orange=30}
    }

    //Using Stream API


    public static void main(String[] args) {
        System.out.print("run put(), result: ");
        put();
        System.out.print("run of(), result: ");
        OfStaticMethod();
        System.out.print("run ofEntriesStaticMethod(), result: ");
        ofEntriesStaticMethod();

    }
}
