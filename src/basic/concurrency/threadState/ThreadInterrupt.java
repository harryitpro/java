package basic.concurrency.threadState;

import basic.concurrency.resource.Counter;

public class ThreadInterrupt {
    //demo interrupt a thread before it starts processing data update
    public static void interruptThread() {
        Counter counter = new Counter(0, 5);  //pause 5 seconds
        Thread t1 = new Thread(() -> counter.increment());
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " gets interrupted");
        }
        t1.interrupt();
        /**
         * output:
         * Thread-0 is sleeping for 5 seconds.
         * Thread-0 get interrupted
         */
    }

    //demo interrupt a thread before it starts processing data update
    public static void noInterruptThread() {
        Counter counter = new Counter(0, 5);  //pause 5 seconds
        Thread t1 = new Thread(() -> counter.increment());
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " gets interrupted");
        }
        /**
         * output: normal run
         * Thread-1 is sleeping for 5 seconds.
         * Thread-1 incremented counter to: 1
         */
    }

    public static void main(String[] args) {
        interruptThread();
        noInterruptThread();
    }
}
