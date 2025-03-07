package algorithms.character;

import java.util.Arrays;

/**
 * count frequency of characters in lowercase for a given string s, using Array
 * the index of the array is implicitly by character.
 */
public class CharCountOfString {
    public static int[] countChars(String s) {
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
        String s = "This is an exciting news";
        System.out.println(Arrays.toString(countChars(s))); //expecting {1,0,1,0....1,0,0]
        //result: [1, 0, 1, 0, 2, 0, 1, 1, 4, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 2, 0, 0, 1, 1, 0, 0]
    }
}
