package algorithms.character;

import java.util.*;

/**
 * count frequency of characters in lowercase for a given string s, using Array
 * the index of the array is implicitly by character.
 */
public class CharCountOfString {
    public static Map<Character, Integer> countCharsToMap(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        return charCount;
    }

    public static int[] countCharsToArray(String s) {
        int[] charCount = new int[26]; //ASCII max numbers, index 0 : 'a', default value is 0
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                charCount[index]++;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        String s = "Thisisanexcitingnews";
        System.out.println(Arrays.toString(countCharsToArray(s))); //expecting {1,0,1,0....1,0,0]
        System.out.println(countCharsToMap(s)); //expecting {1,0,1,0....1,0,0]
        //result: [1, 0, 1, 0, 2, 0, 1, 1, 4, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 2, 0, 0, 1, 1, 0, 0]
    }
}
