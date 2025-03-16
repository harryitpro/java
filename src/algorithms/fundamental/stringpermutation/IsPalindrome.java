package algorithms.fundamental.stringpermutation;

/**
 * given a String, verify whether it's a palindrome
 */
public class IsPalindrome {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("catac")); //true
        System.out.println(isPalindrome("cattac")); //true
        System.out.println(isPalindrome("cbttac")); //false
    }
}
