package algorithms.map.frequencymapapproach;

import java.util.Map;

/**
 * Find duplicated numbers in an unsorted array:
 * Hint:
 * use Set to verify duplication: set's add(element) method returns false if the element already exists.
 */
public class DuplicationCheck {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 1, 3, 6, 4};
        Map<Integer, Integer> countMap = FrequencyCounter.countEachFrequency(arr);
        for (Map.Entry e : countMap.entrySet()) {
            if ((int) e.getValue() > 1) System.out.println(e.getKey());
        }
    }
}
