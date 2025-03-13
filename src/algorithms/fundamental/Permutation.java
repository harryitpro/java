package algorithms.fundamental;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Permutation {
    //a permutation means 2 words should have the same character set and frequency

    /**
     * solution: sort a word using nlog(n) time. both arrays should be identical after sorting.
     * Similar questions: anagram, permutations...
     */
    static boolean isPermutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        char[] word1chars = word1.toCharArray();
        char[] word2chars = word2.toCharArray();
        Arrays.sort(word1chars);
        Arrays.sort(word2chars);

        return Arrays.equals(word1chars,word2chars);
    }

    //linear time
    public static boolean isPermutationCharFrequency(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[256]; // Assuming ASCII character set

        for (char c : s1.toCharArray()) {
            count[c]++; // Increment character count
        }

        for (char c : s2.toCharArray()) {
            count[c]--; // Decrement character count
            if (count[c] < 0) return false; // More occurrences in s2
        }

        return true;
    }

    private static List<String> generatePermutations(String s) {
        if (s.isEmpty()) {
            throw new RuntimeException("string is empty");
        }

        List<String> result = new ArrayList<>();

        // Base case: return the String into the result when only one letter string
        if (s.length() == 1) {
            result.add(s);
            return result;
        }

        char firstChar = s.charAt(0); // Extract first character
        String remaining = s.substring(1); // Get remaining substring

        // Recursively get permutations of the remaining string
        List<String> smallerPermutations = generatePermutations(remaining);

        // Insert firstChar into every position of each smaller permutation
        for (String perm : smallerPermutations) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = perm.substring(0, i) + firstChar + perm.substring(i);
                result.add(newPerm);
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        List<String> perms = generatePermutations("abc");
//        perms.stream().forEach(System.out::println);
        System.out.println(isPermutationCharFrequency("abc", "bac"));
    }
}
