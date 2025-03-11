package algorithms.fundamental.arrayTwoPointersApproach;

import java.util.*;

/**
 * Problem Statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Hint: variable length SlidingWindow + Set
 */

public class LongestSubstringWithoutRepeating {
    static int solution(String s) {
        if (s.length() == 0) return 0;

        int left = 0, N = s.length();
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(left));
        int maxLength = 1;
        Character c;
        for (int right = left + 1; right < N; right++) {
            c = s.charAt(right);
            while (set.contains(c)) {
                //shrink window by increasing left pointer, adjust set accordingly
                left++; //shrink window.
                set.remove(s.charAt(left - 1));
            }
            //move on with current character
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("run solution: " + solution("abcabcbb")); //expected 3
    }
}
