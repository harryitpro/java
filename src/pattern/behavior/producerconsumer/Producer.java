package pattern.behavior.producerconsumer;

import java.util.concurrent.BlockingQueue;

/**
 * what is producer-consumer pattern
 * ChatGPT said:
 * The Producer-Consumer Pattern is a classic design pattern used to handle the production and consumption of data in a thread-safe and decoupled manner. It is commonly used in multi-threaded applications and message-driven architectures.
 *
 * Concept
 * Producer: Generates data and places it in a shared resource (like a queue).
 * Consumer: Takes data from the shared resource and processes it.
 * Buffer (Shared Resource): A data structure (like a queue) that acts as an intermediary between the producer and the consumer.
 * Key Features
 * Decoupling: The producer and consumer work independently, allowing for scalability.
 * Thread Safety: Synchronization mechanisms ensure that multiple producers and consumers can operate without corrupting data.
 * Blocking or Non-blocking:
 * Blocking: The producer waits if the buffer is full, and the consumer waits if it's empty.
 * Non-blocking: Uses asynchronous techniques like callbacks or message queues.
 */
class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i);  // Puts item in the queue (blocks if full)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = queue.take();  // Takes item from the queue (blocks if empty)
                System.out.println("Consumed: " + item);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

