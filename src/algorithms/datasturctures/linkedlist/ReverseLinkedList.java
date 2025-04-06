package algorithms.datasturctures.linkedlist;

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
}
