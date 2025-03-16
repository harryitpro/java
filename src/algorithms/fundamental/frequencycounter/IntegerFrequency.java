package algorithms.fundamental.frequencycounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntegerFrequency {
    static Map<Integer, Integer> toFreq(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        char[] digitArray = {'1', '2', '3', '4', '5'};
        int[] intArray = new int[digitArray.length];
        for (int i = 0; i < digitArray.length; i++) {
            intArray[i] = Character.getNumericValue(digitArray[i]);
        }
        System.out.println(Arrays.toString(intArray)); // Output: [1, 2, 3, 4, 5]
        Map<Integer, Integer> freq = toFreq(intArray);
        System.out.println(freq);
        System.out.println(freq.get(3)); //1
    }
}
