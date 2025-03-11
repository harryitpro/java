package algorithms.map.frequencymapapproach;

import java.util.Map;

/**
 * use FrequencyCount approach to solve whether 2 strings are anagrams/permutations of each other.
 * *
 * //how about multiple strings are anagrams of each other:  group.
 */
public class ValidateAnagram {
    static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> s1CharCountMap = FrequencyMap.getCountMap(s1.toCharArray());
        Map<Character, Integer> s2CharCountMap = FrequencyMap.getCountMap(s2.toCharArray());
        return s1CharCountMap.equals(s2CharCountMap);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("abc","bac"));
    }
}
