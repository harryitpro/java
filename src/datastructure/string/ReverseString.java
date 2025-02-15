package datastructure.string;

import java.lang.StringBuilder;

/**
 * task: reverse a given datastructure.string.
 * 1: get an array of char using datastructure.string.toCharArray.
 * or use datastructure.string.charAt(index) to get any unique element.
 * 2: reverse the char to the datastructure.string.
 * 3, Swap / or using StringBuilder
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
