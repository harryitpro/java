package algorithms.fundamental;

import java.util.Arrays;

/**
 * convert a digit character to int in java, we can use either one of below.
 * Subtracting '0' (works for single digits 0-9)
 * Using Character.getNumericValue()
 * Using Integer.parseInt() with single character String
 */
public class DigitCharToInt {
    //Subtracting '0' to get int value of a character
    static int charToInt(char c) {
        return c - '0';
    }

    //addition '0' to get char unicode of a digit
    static char intToChar(int n) {
        return (char) (n + '0');
    }

    static int[] toInts(String s) {
        int[] ints = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ints[i] = s.charAt(i) - '0';
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toInts("1234567890"))); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        System.out.println(intToChar(1));  // 1
        char c = (char) 65;
        String s = String.valueOf(c);
        System.out.println(s); //A
    }
}
