package pattern.creational;

import java.util.Arrays;
import java.util.List;

/**
 * Static or Instance factory method, to encapsulate specific logic of Instantiation
 * Example: Arrays utility's asList()
 */
public class FactoryMethod {
    static List<String> getListOfNames() {
        return Arrays.asList("Alice", "Bob", "Tom");
    }

    public static void main(String[] args) {
        List<String> list = getListOfNames();
        System.out.println(list.toString()); //[Alice, Bob, Tom]
    }
}

