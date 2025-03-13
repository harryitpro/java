package algorithms.datasturctures.list;

import java.util.ArrayList;
import java.util.Map;

/**
 * Constructor and Description
 * ArrayList() : Constructs an empty list with an initial capacity of ten.
 * ArrayList(Collection<? extends E> c)  :Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
 * ArrayList(int initialCapacity) : Constructs an empty list with the specified initial capacity.
 */
public class ArrayListConstructorFromCollection {
    //construct an arraylist from map entry
    public ArrayList construct(Map<String, Integer> map) {
        return new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    }
}
