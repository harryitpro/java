package algorithms.fundamental.realworldsolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * explanation:
 * Map<String, Map<String, Integer>>  K: item, V: co-purchased items and their corresponding frequency.
 * for given item, sort its co-purchased items by frequency desc. return the limit item names.
 */
public class FrequentlyBuyTogetherRecommendation {
    private static List<String> recommendItem(List<List<String>> orders, String item, int limit) {
        //init the graph with new HashMap
        Map<String, Map<String, Integer>> graph = new HashMap<>();

        //add co-purchased items through order history.
        addEdgesByList(graph, orders);

        return getRecommendItems(graph, item, limit);
    }

    /**
     * build order history graph by adding orders.
     *
     * @param graph   orderHistory, represent in graph data model.
     * @param orders: orders resource data.
     */
    static void addEdgesByList(
            Map<String, Map<String, Integer>> graph, List<List<String>> orders) {
        for (List<String> orderItems : orders) {
            for (String item : orderItems) {
                graph.put(item, graph.getOrDefault(item, new HashMap<>()));
                Map<String, Integer> coPurchaseItemMap = graph.get(item);
                orderItems.stream()
                        .filter(orderItem -> !orderItem.equals(item))
                        .forEach(orderItem -> coPurchaseItemMap.put(orderItem, coPurchaseItemMap.getOrDefault(orderItem, 0) + 1));

            }
        }
    }

    /**
     * @param graph orderHistory graph.
     * @param item: given item for recommendations.
     * @param limit
     * @return
     */
    static List<String> getRecommendItems(
            Map<String, Map<String, Integer>> graph, String item, int limit) {
        Map<String, Integer> coPurchasedItemFrequency = graph.get(item);

        if (coPurchasedItemFrequency == null)
            return new ArrayList<>();

        return coPurchasedItemFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
                .limit(limit)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        //input: order history
        List<List<String>> orders = List.of(
                List.of("Laptop", "Mouse", "Keyboard"),
                List.of("Phone", "Charger", "Case"),
                List.of("Laptop", "Mouse", "Headphones"),
                List.of("Phone", "Charger"),
                List.of("Laptop", "Keyboard")
        );

        //requirement: for
        String purchasedItem = "Laptop";
        int recommendationLimit = 2;

        List<String> recommendations = recommendItem(orders, purchasedItem, recommendationLimit);
        System.out.println(recommendations); // Expected output: [Mouse, Keyboard] (based on frequency)
    }
}
