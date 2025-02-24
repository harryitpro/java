package algorithms.linkedlist;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int value){
            this.data = value;
            this.next = null;
        }
    }

    // Reverse the linked list recursively
    public Node reverseListRecursive(Node head) {
        // Base case: if list is empty or has one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call to the rest of the list
        Node newHead = reverseListRecursive(head.next);

        // Reverse the links
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Helper method to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList(head);

        head = list.reverseListRecursive(head);
        System.out.println("Reversed List:");
        list.printList(head);
    }
}
