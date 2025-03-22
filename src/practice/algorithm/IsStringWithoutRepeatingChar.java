package practice.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Find duplicated numbers in an unsorted array:
 */
public class IsStringWithoutRepeatingChar {
    public static boolean isUniqueString(String s) {
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

    public static void main(String[] args) {
        String s = "no duplicated"; //letter d is duplicated
        System.out.println(isUniqueString(s)); //false
    }
}
