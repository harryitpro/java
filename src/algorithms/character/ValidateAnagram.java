package algorithms.character;

import java.util.Map;

/**
 * use FrequencyCount approach to solve whether 2 strings are anagrams/permutations of each other.
 * *
 * //how about multiple strings are anagrams of each other:  group.
 */
public class ValidateAnagram {
    static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> s1CharCountMap = FrequencyCounter.getCharCountMap(s1);
        Map<Character, Integer> s2CharCountMap = FrequencyCounter.getCharCountMap(s1);
        return s1CharCountMap.equals(s2CharCountMap);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","bac"));
    }
}
