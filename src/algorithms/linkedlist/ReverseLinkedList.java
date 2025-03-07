package algorithms.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    // Helper method to create a linked list from an array
    static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the list
    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ReverseLinkedList {
    // Iterative approach - O(n) time, O(1) space
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // Store next
            next = current.next;
            // Reverse current node's pointer
            current.next = prev;
            // Move prev and current one step forward
            prev = current;
            current = next;
        }
        return prev; // new head
    }

    // Recursive approach - O(n) time, O(n) space due to recursion stack
    public ListNode reverseListRecursive(ListNode head) {
        // Base cases: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call
        ListNode newHead = reverseListRecursive(head.next);

        // Reverse the links
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();

        // Create test list: 1->2->3->4->5
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createList(arr);

        System.out.println("Original list:");
        ListNode.printList(head);

//        // Test iterative reversal
//        ListNode reversedIterative = solution.reverseListIterative(head);
//        System.out.println("Reversed list (iterative):");
//        ListNode.printList(reversedIterative);

        // Create another list for recursive test
        head = ListNode.createList(arr);
        ListNode reversedRecursive = solution.reverseListRecursive(head);
        System.out.println("Reversed list (recursive):");
        ListNode.printList(reversedRecursive);
    }
}
