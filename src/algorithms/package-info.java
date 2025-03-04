package algorithms;
/**
 * data structures in java
 * Java provides various data structures to store and manage data efficiently. These data structures are mainly part of the Java Collections Framework (JCF) and are classified into the following categories:
 * 1. Linear Data Structures
 *     a) Arrays
 *     Fixed-size data structure storing elements of the same type.
 *     Provides fast access (O(1) for indexing).
 *     Drawback: Fixed size, costly resizing.
 *         int[] arr = new int[5];
 *         arr[0] = 10;
 *
 *     b) Linked List:
 *     Nodes are linked together dynamically.
 *     Operations: Insert, delete in O(1) (at head/tail), search in O(n).
 *         LinkedList<Integer> list = new LinkedList<>();
 *         list.add(10);
 *         list.add(20);
 *
 *     c) Stack (LIFO - Last In, First Out): Only needs to maintain head pointer
 *     Uses Stack<E> or Deque<E>.
 *     Supports push(), pop(), peek() operations.
 *        Stack<Integer> stack = new Stack<>();
 *        stack.push(10);
 *        stack.push(20);
 *        int top = stack.pop(); // Removes 20
 *
 *     d) Queue (FIFO - First In, First Out)
 *     Implemented using Queue<E> (e.g., LinkedList, PriorityQueue).
 *     Operations: offer(), poll(), peek().
 *         Queue<Integer> queue = new LinkedList<>();
 *         queue.offer(10);
 *         queue.offer(20);
 *         int front = queue.poll(); // Removes 10
 *
 *     e) Deque (Double-Ended Queue)
 *     Allows insertions/deletions from both ends.
 *     Implemented via ArrayDeque<E>.
 *         Deque<Integer> deque = new ArrayDeque<>();
 *         deque.addFirst(10);
 *         deque.addLast(20);
 *         deque.removeFirst();
 *
 *
 * Linear Data Structure
 * elements are arranged in a sequential order, and each element is connected to its previous and next element. The data is stored contiguously, and traversal is performed in a single direction at a time.
 */


/**
 * Non-Linear Data Structures
 * Characteristics of Non-Linear Data Structures
 * ✅ Non-sequential storage of elements.
 * ✅ Multiple connections between elements (not just next/previous).
 * ✅ Efficient for complex operations like searching, sorting, and hierarchical storage.
 * ✅ Examples: Trees, Graphs, Hash Tables, Heaps.
 *
 *    a) HashMap (Key-Value Pair)
 *    Uses hashing for fast lookup (O(1) average case).
 *    Implemented via HashMap<K, V>.
 *         HashMap<String, Integer> map = new HashMap<>();
 *         map.put("Alice", 30);
 *         map.put("Bob", 25);
 *         int age = map.get("Alice"); // 30
 *     b) TreeMap (Sorted Key-Value Map)
 *     Sorted key-value structure (O(log n) operations).
 *     Implements Red-Black Tree.
 *         TreeMap<Integer, String> treeMap = new TreeMap<>();
 *         treeMap.put(1, "One");
 *         treeMap.put(2, "Two");
 *     c) HashSet (Unique Elements)
 *     No duplicate elements.
 *     Uses hashing for fast access.
 *         HashSet<Integer> set = new HashSet<>();
 *         set.add(10);
 *         set.add(20);
 *     d) TreeSet (Sorted Set)
 *     No duplicates, maintains sorted order.
 *     Uses Red-Black Tree.
 *         TreeSet<Integer> treeSet = new TreeSet<>();
 *         treeSet.add(30);
 *         treeSet.add(10);
 */