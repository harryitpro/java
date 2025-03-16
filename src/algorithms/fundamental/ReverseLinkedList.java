package algorithms.fundamental;

import algorithms.datasturctures.Node;

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {//loop stops till current is null
            next = current.next;  //keep next reference
            current.next = prev; //process reverse
            prev = current; //move on

            current = next; //update current index
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
