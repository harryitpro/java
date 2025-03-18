package basic.concurrency.threadcreation;

public class CountDownLambda {
    public void countDown() {
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        CountDownLambda task = new CountDownLambda();
        Thread countDownthread = new Thread(() -> task.countDown());
        countDownthread.start();
    }

    /**
     * Why this works?
     * a lambda without parameters
     */
}
