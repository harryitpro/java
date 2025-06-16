package algorithms.algorithms.basic;

import java.util.*;

/**
 * transform a word to char[], sort it to new word.
 * anagram words should be the same.
 */
public class Map_AnagramGroups {
    static Set<Map<Character, Integer>> findAnagramsToSet(String[] words) {
        Set<Map<Character, Integer>> groupSet = new HashSet<>();
        for (String word : words) {
            Map<Character, Integer> charFreq = new HashMap<>();
            for (char c : word.toCharArray()) {
                charFreq.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
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
            anagramMap.computeIfAbsent(sortedWord, (String key) -> new ArrayList<>()).add(word);
        }
        return anagramMap;
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live", "veil"};
        System.out.println(findAnagrams(words).size()); //3 groups
        System.out.println(findAnagramsToSet(words).size());
    }
}

