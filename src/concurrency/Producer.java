package concurrency;

/**
 * The Producer-Consumer problem is a classic synchronization problem
 * where multiple producer threads create data and multiple consumer threads process that data.
 */

/**
 *  Using a BlockingQueue in Java makes implementing this problem easier, as it handles synchronization internally.
 *
 * 1. Solution Using BlockingQueue
 * Key Points:
 *
 * BlockingQueue automatically handles waiting if the queue is empty (for consumers) or full (for producers).
 * No need for wait() or notify(), making it simpler than manual synchronization.
 */

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int id;

    public Producer(BlockingQueue<Integer> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                int item = (id * 10) + i; // Unique items per producer
                queue.put(item); // Blocks if full
                System.out.println("Producer " + id + " produced: " + item);
                Thread.sleep(500); // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private int id;

    public Consumer(BlockingQueue<Integer> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = queue.take(); // Blocks if empty
                System.out.println("Consumer " + id + " consumed: " + item);
                Thread.sleep(1000); // Simulate time taken to process
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}



