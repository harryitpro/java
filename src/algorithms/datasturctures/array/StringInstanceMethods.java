package algorithms.datasturctures.array;

import java.util.Arrays;

/**
 * Commonly Used Instance Methods in String Class
 * Method	Description
 * length()	Returns the length of the string.
 * charAt(index)	Returns the character at a specific index.
 * substring(beginIndex, endIndex)	Extracts a part of the string.
 * indexOf(char) / lastIndexOf(char)	Finds the position of a character or substring.
 * toUpperCase() / toLowerCase()	Converts the string to uppercase/lowercase.
 * trim()	Removes leading and trailing spaces.
 * replace(oldChar, newChar)	Replaces characters or substrings.
 * contains(substring)	Checks if the string contains a given sequence.
 * equals(str) / equalsIgnoreCase(str)	Compares two strings (case-sensitive or case-insensitive).
 * startsWith(prefix) / endsWith(suffix)	Checks if the string starts or ends with a specific sequence.
 * split(delimiter)	Splits the string into an array based on a delimiter.
 * isEmpty() / isBlank() (Java 11+)	Checks if the string is empty or only contains whitespace.
 */
public class StringInstanceMethods {
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
}
