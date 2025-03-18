package basic.concurrency.threadstate;

import basic.concurrency.resource.Counter;

/**
 * instance methods.
 * ensure that a thread finishes its task before the main program (or another thread) continues.
 * Purpose: It blocks the calling thread until the thread on which join() is called terminates.
 *
 * Variants:
 * join(): Waits indefinitely for the thread to finish.
 * join(long millis): Waits for the specified number of milliseconds for the thread to finish.
 * join(long millis, int nanos): Waits for the specified milliseconds and nanoseconds.
 * Exception: If the thread is interrupted while waiting, it throws an InterruptedException.
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Thread t1 = new Thread(() -> counter.increment());
        Thread t2 = new Thread(() -> counter.increment());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
        t2.start();
    }
}
