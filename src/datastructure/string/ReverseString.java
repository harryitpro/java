package datastructure.string;

import java.lang.StringBuilder;

/**
 * regard String as a collection of chars.
 * string.toCharArray -> char[] chars = string.toCharArray()
 * visit each char using index: string.charAt()
 *
 */
public class ReverseString {
    String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }
}
