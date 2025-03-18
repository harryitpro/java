package basic.concurrency.threadstate;

/**
 * Thread Static method. to pause thread to stop for a certain amount of time
 * the InterruptedException is a Checked Exception, must be handled with try/catch block or declared in the signature. otherwise will cause compilation error if not
 */
public class ThreadSleep {
    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
    }
}
