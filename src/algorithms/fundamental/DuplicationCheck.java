package algorithms.fundamental;

import java.util.HashSet;
import java.util.Set;

/**
 * Find duplicated numbers in an unsorted array:
 * Hint:
 * use Set to verify duplication: set's add(element) method returns false if the element already exists.
 */
public class DuplicationCheck {
    public static boolean isUniqueString(String s) {
        Set<Character> uniqueSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (uniqueSet.contains(s.charAt(i))) {
//                System.out.println(s.charAt(i));
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
