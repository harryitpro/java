package algorithms.linkedlist.basic;

import java.util.LinkedList;

/**
 * implement SinglyLinkedList.
 * term:
 * head: the first node of the list.
 * tail: if needed, it's the last node in the list. tail.next == null
 */
public class SinglyLinkedList {
    private Node head;

    public void insert(int data) {
        //set head pointer for empty linkedlist
        if (head == null) {
            head = new Node(data);
            return;
        }

        //find last node(tail) and update its pointer to the new Node. keep head pointer unchanged.
        Node tail = head;
        while (tail.next != null) tail = tail.next;

        tail.next = new Node(data);
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        // If the head needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        //find the previous node of the node to be deleted,update the pointer to skip node_to_be_deleted
        Node prev = head;
        while (prev.next != null && prev.next.data != key) prev = prev.next;

        //update pointer.
        if (prev.next != null) prev.next = prev.next.next;
    }

    // traverse
    public void iterate() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " -> ");
        }
        System.out.println("null");
    }

    // Helper method to create a linked list from an array
    static Node createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Node class (inner class)
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.iterate();


        list.delete(20);
        list.iterate(); // Output: 10 -> 30 -> null
        list.delete(40);
        list.iterate(); // Output: 10 -> 30 -> null

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insert(10);
        list2.insert(20);
        list2.insert(30);
        System.out.println("list.equals(list2): " + list.equals(list2)); //false

        LinkedList<Integer> builtinList1 = new LinkedList<>();
        builtinList1.add(10);
        builtinList1.add(20);
        LinkedList<Integer> builtinList2 = new LinkedList<>();
        builtinList2.add(10);
        builtinList2.add(20);
        System.out.println("builtinList1.equals(builtinList2): " + builtinList1.equals(builtinList2)); //true

    }
}


