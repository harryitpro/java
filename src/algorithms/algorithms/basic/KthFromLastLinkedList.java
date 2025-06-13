package algorithms.algorithms.basic;

public class KthFromLastLinkedList {
    // Node class for the singly linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to find the kth node from the last
    public static ListNode findKthFromLast(ListNode head, int k) {
        // Initialize two pointers
        ListNode fast = head;
        ListNode slow = head;

        // Move fast pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null; // k is larger than list length
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow is now at the kth node from the end
        return slow;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Test cases
        int[] kValues = {1, 3, 5, 6};
        for (int k : kValues) {
            ListNode result = findKthFromLast(head, k);
            System.out.println("k = " + k + ": " + (result != null ? result.val : "null"));
        }
    }
}
