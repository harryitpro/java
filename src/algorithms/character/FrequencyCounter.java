package algorithms.character;

import java.util.*;

/**
 * count frequency of characters. to a Map or Array
 * we can use Array, index from 'a' to 'z', by c-'a', the array can start from 0: 'a', to 25: 'z'
 * or Map<Charater,Integer>
 * usage:
 * this usage is useful to compare 2 or multiple strings are valid anagram or permutation of each other if the Map or Array equals
 */
public class FrequencyCounter {

    public static Map<Character, Integer> getCharCountMap(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        return charCount;
    }

    public static int[] getCharCountArray(String s) {
        int[] charCount = new int[26]; //ASCII max numbers, index 0 : 'a', default value is 0
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        return charCount;
    }

    public static void main(String[] args) {
        String s = "Thisisanexcitingnews";
        System.out.println(Arrays.toString(getCharCountArray(s))); //expecting {1,0,1,0....1,0,0]
        System.out.println(getCharCountMap(s)); //expecting {1,0,1,0....1,0,0]
        //result: [1, 0, 1, 0, 2, 0, 1, 1, 4, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 2, 0, 0, 1, 1, 0, 0]
    }
}
