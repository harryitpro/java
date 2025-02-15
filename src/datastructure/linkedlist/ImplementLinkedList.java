package datastructure.linkedlist;


/**
 * LinkedList concept:  pointer
 * How to locate the Last node: if current node's next() is null. while(current.next !=null)
 */
public class ImplementLinkedList {
    private Node top;

    public ImplementLinkedList() {
        top = null;
    }

    public void addTail(int value) {
        Node node = new Node(value);
        if (top == null) {
            top = node;
        } else {
            //locate the Last node
            Node current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void addTop(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

}

