package algorithms.fundamental.frequencycounter;

import java.util.*;

public class DigitCharFrequencyCounter {
    //give a string containing digit character only.
    static Map<Character, Integer> getFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    //How to convert an integer to a character:  1 -> '1'
    static char convertIntegerToCharacter(int i) {
        char c = Character.forDigit(i, 10);
        return Character.forDigit(i, 10);
    }

    //Character.getNumericValue()

    public static void main(String[] args) {
        convertIntegerToCharacter(9);
        String s = "2334567656698";
        Map<Character, Integer> freq = getFrequency(s);

        //traverse using character
        for (int i = 9; i >= 0; i--) {
            char c = Character.forDigit(i, 10);
            if (freq.containsKey(c)) {
                System.out.println(i + ": " + freq.get(c));
            }
        }
    }
}
