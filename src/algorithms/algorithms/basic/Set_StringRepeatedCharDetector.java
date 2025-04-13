package algorithms.algorithms.basic;

import java.util.HashSet;
import java.util.Set;

public class Set_StringRepeatedCharDetector {

    /**
     * @param chars: given sorted array
     * @return : true if arrays contain repeated character.
     */
    boolean containsRepeatedChar(char[] chars) {
        /**
         * HANDLE EDGE CASES: RETURN FALSE
         * * EMPTY array
         * * array has only one element
         */

        /**
         * FOR character FROM 1 TO the LENGTH-1
         * *IF character IS EQUAL TO its previous character.
         * ****RETURN ture
         * *ELSE CONTINUE
         * *END FOR
         * RETURN false
         */
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     *
     * @param s: char sequence is not sorted
     * @return true: all characters are unique
     */
    static boolean isUniqueCharSetString(String s) {
        //use Set to check duplication
        Set<Character> uniqueSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (uniqueSet.contains(s.charAt(i))) {
                return false;
            }
            uniqueSet.add(s.charAt(i));
        }
        return true;
    }
}
