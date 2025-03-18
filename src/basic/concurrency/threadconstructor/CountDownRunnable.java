package basic.concurrency.threadconstructor;

/**
 *
 */
public class CountDownRunnable implements Runnable {
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Thread countDownThread = new Thread(new CountDownRunnable(), "CountDownRunnableTask1");
        System.out.println("start thread of " + countDownThread.getName());
        countDownThread.start();

        Thread countDownThread2 = new Thread(new CountDownRunnable(), "CountDownRunnableTask2");
        System.out.println("start thread of " + countDownThread2.getName());
        countDownThread2.start();

        /**output:
         * start thread of CountDownRunnableTask1
         * start thread of CountDownRunnableTask2
         * 20 19 18 17 16 15 14 13 12 11 10 9 8 20 19 18 17 16 15 14 13 7 12 6 11 5 4 3 2 1 10 9 8 7 6 5 4 3 2 1
         */
    }
}
