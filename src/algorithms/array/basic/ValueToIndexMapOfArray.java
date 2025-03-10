package algorithms.array.basic;

import java.util.*;

public class ValueToIndexMapOfArray {
    //suppose array does not contain duplicate value
    static Map<Integer, Integer> toReverseMap(int[] arr) {
        if ((arr == null) || arr.length == 0) throw new IllegalArgumentException("array cannot be null");
        Map<Integer, Integer> reverseMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            reverseMap.put(arr[i], i);
        }
        return reverseMap;
    }
}
