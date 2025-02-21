Non-Linear Data Structures
Characteristics of Non-Linear Data Structures
✅ Non-sequential storage of elements.
✅ Multiple connections between elements (not just next/previous).
✅ Efficient for complex operations like searching, sorting, and hierarchical storage.
✅ Examples: Trees, Graphs, Hash Tables, Heaps.

   a) HashMap (Key-Value Pair)
   Uses hashing for fast lookup (O(1) average case).
   Implemented via HashMap<K, V>.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        int age = map.get("Alice"); // 30
    b) TreeMap (Sorted Key-Value Map)
    Sorted key-value structure (O(log n) operations).
    Implements Red-Black Tree.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
    c) HashSet (Unique Elements)
    No duplicate elements.
    Uses hashing for fast access.
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
    d) TreeSet (Sorted Set)
    No duplicates, maintains sorted order.
    Uses Red-Black Tree.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);


