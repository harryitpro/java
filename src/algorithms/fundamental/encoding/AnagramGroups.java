package algorithms.fundamental.encoding;

import java.util.*;

/**
 * transform a word to char[], sort it to new word.
 * anagram words should be the same.
 */
public class AnagramGroups {
    static Set<Map<Character, Integer>> findAnagramsToSet(String[] words) {
        Set<Map<Character, Integer>> groupSet = new HashSet<>();
        for (String s : words) {
            Map<Character, Integer> charFreq = new HashMap<>();
            for (char c : s.toCharArray()) {
                charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
            }
            groupSet.add(charFreq);
        }
        return groupSet;
    }

    public static Map<String, List<String>> findAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); // Sort characters
            String sortedWord = new String(chars); // Convert back to string

            // Add to HashMap
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return anagramMap;
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live", "veil"};
        System.out.println(findAnagrams(words).size()); //3 groups
        System.out.println(findAnagramsToSet(words).size());
    }
}

