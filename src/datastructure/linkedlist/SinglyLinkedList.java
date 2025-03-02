package datastructure.linkedlist;


/**
 * implement SinglyLinkedList.
 */
public class SinglyLinkedList {
    // Node class (inner class)
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        // If the head needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // traverse
    public void display() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.delete(20);
        list.display(); // Output: 10 -> 30 -> null
        list.delete(40);
        list.display(); // Output: 10 -> 30 -> null
    }
}


