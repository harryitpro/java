package algorithms.string;

import java.util.*;

/**
 * transform a word to char[], sort it to new word.
 * anagram words should be the same.
 */
public class AnagramGroups {
    public static List<List<String>> findAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); // Sort characters
            String sortedWord = new String(chars); // Convert back to string

            // Add to HashMap
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Collect groups of anagrams (only if more than 1 word)
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : anagramMap.values()) {
            if (group.size() > 1) {
                result.add(group);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live", "veil"};
        System.out.println(findAnagrams(words));
    }
}

