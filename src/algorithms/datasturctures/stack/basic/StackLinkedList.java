package algorithms.datasturctures.stack.basic;

class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    //O(1) time complexity
    //replace top pointer to the new Node, keep existing top as tmp.
    public void push(int data) {
        Node tmp = top;
        top = new Node(data);
        top.next = tmp;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    //O(1) time complexity
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        Node tmp = top;
        top = top.next;
        return tmp.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.pop()); // 300
        System.out.println(stack.peek()); // 200
    }
}

