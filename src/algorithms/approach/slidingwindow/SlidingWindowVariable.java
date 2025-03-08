package algorithms.approach.slidingwindow;

/**
 * Problem Statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Approach:
 * Use a HashSet to track characters in the current window.
 * Expand the window by adding new characters.
 * If a duplicate is found, shrink the window until it's unique again.
 */

import java.util.HashSet;

public class SlidingWindowVariable {
    public static int longestUniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++; // Shrink window
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of Longest Unique Substring: " + longestUniqueSubstring(s));
    }
}
