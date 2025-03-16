package algorithms.fundamental.frequencycounter;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    static Map<Character, Integer> toFreq(char[] chars) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : chars) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "string";
        Map<Character, Integer> freq = toFreq(s.toCharArray());
        System.out.println(freq);
    }
}
