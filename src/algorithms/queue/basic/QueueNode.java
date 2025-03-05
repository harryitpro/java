package algorithms.queue.basic;

/**
 * Queue: FIFO
 * enqueue: operate on the rear node.
 * dequeue: operate on the first node
 */
public class QueueNode {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear; //front for dequeue, rear for enqueue

    public QueueNode() {
        front = rear = null;
    }

    public boolean isEmtpy() {
        return front == null; //no node in this queue
    }

    //work on the rear node
    //add one node to the queue
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmtpy()) {
            front = node;
            rear = front;
        } else {
            //add new node the rear's next reference
            rear.next = node;
            //move rear pointing to the new one.
            rear = rear.next;
        }
    }

    //remove one node from the queue
    //return the front node value
    public int dequeue() {
        if (isEmtpy()) {
            throw new RuntimeException("empty queue");
        }
        Node node = front;
        front = front.next;
        return node.data;
    }
    // Display Queue
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueNode queue = new QueueNode();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: 10 20 30

        queue.dequeue();
        queue.display(); // Output: 20 30
    }
}
