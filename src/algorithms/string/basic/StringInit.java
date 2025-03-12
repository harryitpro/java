package algorithms.string.basic;

/**
 * List of Common Static Methods in String Class
 * Method	Description
 * String.valueOf(anyType)	Converts various data types to a String.
 * String.valueOf(charArray, offset, length)	Converts part of a char array to a String.
 * String.format(format, args...)	Returns a formatted string (like printf).
 * String.join(delimiter, elements...)	Joins multiple strings with a delimiter.
 * String.copyValueOf(charArray)	Converts a char array to a String.
 * String.copyValueOf(charArray, offset, length)	Converts part of a char array to a String.
 * <p>
 * <p>
 * Instance methods
 */
public class StringInit {

    //String constructor with char array argument
    //Remember chars.toString() will return an instance reference! not a String composed of array

    static String newObjectFromArray(char[] arr) {
        return new String(arr);
    }

    static String fromStringStaticMethod(char[] arr) {
        return String.valueOf(arr);

    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b'};
        System.out.println(newObjectFromArray(chars)); //ab
        System.out.println(fromStringStaticMethod(chars));// ab
    }
}
