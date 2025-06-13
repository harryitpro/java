package algorithms.practice;

import java.util.*;

//Pseudocode
public class Recommendation {
    //represent a transaction using a List<String>: the product name list within the order.
    //for all transactions, List<List<String>>;

    public static Map<String, Integer> fillItemFreq(List<List<String>> trans, String keyItem) {
        Map<String, Integer> itemFreq = new HashMap<>();
        for (List<String> items : trans) {
            items.forEach(
                    item -> {
                        if (!item.equals(keyItem)) {
                            itemFreq.put(item, itemFreq.getOrDefault(item, 0) + 1);
                        }
                    }
            );
        }
        return itemFreq;
    }

    public static List<String> recommend(String item, int limit, List<List<String>> transactions) {
        List<String> recommended = new ArrayList<>();
        //build an itemFreq data structure to hold co-purchased items and their count

        //pick the first "limit" items as recommendations.
        Map<String, Integer> itemFreq = fillItemFreq(transactions, item);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(itemFreq.entrySet());
        entries.sort(
                (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())
        );

        int min = Math.min(limit, entries.size());
        int index = 0;
        entries.forEach(
                (entry) -> {
                    if (index < min) {
                        recommended.add(entry.getKey());
                    }
                }
        );
        return recommended;
    }

    static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(
                (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())
        );
        list.forEach(
                (e) -> sortedMap.put(e.getKey(), e.getValue())
        );
        return sortedMap;
    }
}
