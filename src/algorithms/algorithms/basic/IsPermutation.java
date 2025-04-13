package algorithms.algorithms.basic;

public class IsPermutation {
    //a permutation means 2 words should have the same character set and frequency
    //linear time
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[256]; // Assuming ASCII character set
        //build Frequency Counter for the first string
        for (char c : s1.toCharArray()) {
            count[c]++; // Increment character count
        }
        //loop the second string, update the frequency counter to verify match
        for (char c : s2.toCharArray()) {
            count[c]--; // Decrement character count
            if (count[c] < 0) return false; // More occurrences in s2
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bac"));
    }
}
