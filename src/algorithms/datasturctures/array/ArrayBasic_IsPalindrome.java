package algorithms.datasturctures.array;

/**
 * given a String, verify whether it's a palindrome
 */
public class ArrayBasic_IsPalindrome {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
