package basic.string;

/**
 * StringBuilder is mutable, meaning its contents can be modified without creating a new object.
 * The reverse() method modifies the current StringBuilder instance by reversing the characters.
 * It returns this, allowing method chaining.
 */
public class StringBuilderBasics {
    static void reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
    }
}
