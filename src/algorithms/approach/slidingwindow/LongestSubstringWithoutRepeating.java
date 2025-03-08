package algorithms.approach.slidingwindow;

import java.util.HashSet;

/**
 * Problem Statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Approach: -- Variable width SlingingWindow
 * Use a HashSet to track characters in the current window.
 * Expand the window by adding new characters.
 * If a duplicate is found, shrink the window until it's unique again.
 */
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>(); //use set to verify whether character is repeated.

        //one loop to iterate array of string, ends when right pointer reaches the end.
        //right pointer: for expand the window
        //left pointer: start the window, and shrink the window by left++
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
    }
}
