package basic.concurrency.resource;

public class Counter {
    private int count;
    private int sleepTimeInSeconds;

    public Counter(int initialValue, int sleepTimeInSeconds) {
        this.count = initialValue;
        this.sleepTimeInSeconds = sleepTimeInSeconds;
    }

    public void increment() {
        try {
            System.out.println(Thread.currentThread().getName() + " is sleeping for " + sleepTimeInSeconds + " seconds.");
            Thread.sleep(sleepTimeInSeconds * 1000);
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + count);
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() + " get interrupted");
        }
    }

    public void decrement() {
        count--;
    }
}
