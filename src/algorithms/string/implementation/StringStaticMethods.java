package algorithms.string.implementation;

import java.util.Arrays;

/**
 *List of Common Static Methods in String Class
 * Method	Description
 * String.valueOf(anyType)	Converts various data types to a String.
 * String.valueOf(charArray, offset, length)	Converts part of a char array to a String.
 * String.format(format, args...)	Returns a formatted string (like printf).
 * String.join(delimiter, elements...)	Joins multiple strings with a delimiter.
 * String.copyValueOf(charArray)	Converts a char array to a String.
 * String.copyValueOf(charArray, offset, length)	Converts part of a char array to a String.
 *
 *
 * Instance methods
 */
public class StringStaticMethods {

    /**
     * this transformation can be used for char array sorting.
     */
    static char[] toCharArray() {
        String str = "hello";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray)); //[e, h, l, l, o]
        return charArray;
    }

    //String constructor with char array argument
    static String convertCharArrayToString(char[] arr) {
        String s1 = new String(arr);
        System.out.println(s1);
        String s2 = String.valueOf(arr);
        System.out.println(s2);
        System.out.println("s1 == s2 ? " + s1 == s2);
        System.out.println("s1.equals(s2) ? " + s1.equals(s2));
        return s1;
    }


    public static void main(String[] args) {
        toCharArray();
        convertCharArrayToString(new char[]{'a','b'});
    }
}
