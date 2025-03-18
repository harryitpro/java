package basic.concurrency.threadstate;

import basic.concurrency.resource.Counter;

public class ThreadInterrupt {
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
    }

    public static void main(String[] args) {
        interruptThread();
    }
}
