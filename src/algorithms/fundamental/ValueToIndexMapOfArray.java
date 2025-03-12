package algorithms.fundamental;

import java.util.*;

public class ValueToIndexMapOfArray {
    static Map<Integer, Integer> vToIndexMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(vToIndexMap(arr)); //{1=0, 2=1, 3=2, 4=3, 5=4}
    }
}
