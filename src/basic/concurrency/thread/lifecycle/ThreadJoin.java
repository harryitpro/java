package basic.concurrency.thread.lifecycle;

import basic.concurrency.thread.Counter;

/**
 * instance methods.
 * ensure that a thread finishes its task before the main program (or another thread) continues.
 * Purpose: It blocks the calling thread until the thread on which join() is called terminates.
 * <p>
 * Variants:
 * join(): Waits indefinitely for the thread to finish.
 * join(long millis): Waits for the specified number of milliseconds for the thread to finish.
 * join(long millis, int nanos): Waits for the specified milliseconds and nanoseconds.
 * Exception: If the thread is interrupted while waiting, it throws an InterruptedException.
 * <p>
 * <p>
 * State of the Main Thread During join()
 * The state of the main thread depends on which variant of join() is called:
 * <p>
 * join() (No Timeout):
 * When the main thread calls thread.join() (without a timeout), it waits indefinitely for thread to finish.
 * The main thread’s state becomes WAITING.
 * It remains in the WAITING state until thread terminates (reaches the TERMINATED state) or the main thread is interrupted (e.g., via interrupt()), at which point it throws an InterruptedException and returns to RUNNABLE.
 * join(long millis) or join(long millis, int nanos) (With Timeout):
 * When the main thread calls thread.join(1000) (with a timeout), it waits for the specified time or until thread finishes, whichever comes first.
 * The main thread’s state becomes TIMED_WAITING.
 * It stays in TIMED_WAITING until either:
 * The timeout expires, and the main thread returns to RUNNABLE.
 * thread terminates before the timeout, and the main thread returns to RUNNABLE.
 * The main thread is interrupted, throwing an InterruptedException and returning to RUNNABLE.
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread counterIncrementT1 = new Thread(() -> counter.increment());
        Thread counterIncrementT2 = new Thread(() -> counter.increment());
        counterIncrementT1.start();

        try {
            counterIncrementT1.join();
        } catch (InterruptedException ex) {
            System.out.println("main thread interrupted");
        }

        counterIncrementT1.start();
    }
}
