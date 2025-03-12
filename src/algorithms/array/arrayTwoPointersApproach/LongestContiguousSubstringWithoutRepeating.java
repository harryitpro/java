package algorithms.array.arrayTwoPointersApproach;

import java.util.*;

/**
 * Problem Statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Hint: variable length SlidingWindow + Set
 */

public class LongestContiguousSubstringWithoutRepeating {
    static int solution(String s) {
        if (s.length() == 0) return 0;

        int left = 0, N = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        Character c;
        for (int right = left; right < N; right++) {
            c = s.charAt(right);
            while (set.contains(c)) {
                //shrink window by increasing left pointer, adjust set accordingly
                set.remove(s.charAt(left));
                left++; //shrink window.
            }
            set.add(c);  //this char is unique
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("run solution: " + solution("abcabcbb")); //expected 3
    }
}
