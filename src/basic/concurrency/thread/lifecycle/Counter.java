package basic.concurrency.thread.lifecycle;

public class Counter {
    private int count;
    private int sleepInSeconds;

    public Counter(int i, int i1) {
        this.count = i;
        this.sleepInSeconds = i1;
    }

    public void increment() {
        try {
            Thread.sleep(sleepInSeconds * 1000);
            count++;
        } catch (InterruptedException e) {
            System.out.println("interrupted, skip operation");
        }
    }
}
