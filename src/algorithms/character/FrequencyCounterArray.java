package algorithms.character;

import java.util.Arrays;

/**
 * count frequency of characters.
 * alternative solution to FrequencyMap.getCountMap:
 * we can use Array, index from 'a' to 'z', by c-'a', the array can start from 0: 'a', to 25: 'z'
 * this way is only useful for ASCII, which has small size of Array
  */
public class FrequencyCounterArray {

    public static int[] getCountArray(String s) {
        int[] charCount = new int[26]; //ASCII max numbers, index 0 : 'a', default value is 0
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        return charCount;
    }

    public static void main(String[] args) {
        String s = "Thisisanexcitingnews";
        System.out.println(Arrays.toString(getCountArray(s))); //expecting {1,0,1,0....1,0,0]
    }
}
