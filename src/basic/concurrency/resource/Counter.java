package basic.concurrency.resource;

public class Counter {
    private int count;

    public Counter(int initialValue) {
        this.count = initialValue;
    }

    public void increment() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            //just wait for 2 seconds
        }

        count++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + count);
    }

    public void decrement() {
        count--;
    }
}
