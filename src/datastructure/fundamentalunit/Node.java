package datastructure.fundamentalunit;

/**
 * Node (Tree & Linked List)
 * A node is a fundamental unit in hierarchical data structures like trees and linked lists.
 * In a tree, a node contains:
 * Data
 * References (pointers) to child nodes
 * The topmost node is called the root, and nodes without children are leaf nodes.
 */
public class Node {
    int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }
}
