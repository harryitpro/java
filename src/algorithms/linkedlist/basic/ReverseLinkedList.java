package algorithms.linkedlist.basic;

public class ReverseLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null, current = head, next = current.next;
        while (current != null) { //loop stops till current is null
            //process reverse
            next = current.next;
            current.next = prev;
            //move on
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead = reverse(head);
        //print reversed linked list
        Node current = newHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }
}
