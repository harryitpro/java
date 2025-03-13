package kafka.producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10); // Capacity of 10

        Thread producer1 = new Thread(new Producer(queue, 1));
        Thread producer2 = new Thread(new Producer(queue, 2));
        Thread consumer1 = new Thread(new Consumer(queue, 1));
        Thread consumer2 = new Thread(new Consumer(queue, 2));

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
