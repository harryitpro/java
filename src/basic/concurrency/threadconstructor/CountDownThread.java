package basic.concurrency.threadconstructor;

//Thread inherently is a mechanism to execute tasks simultaneously.

/**
 * integrate Runnable to Thread
 */
public class CountDownThread extends Thread {
    @Override
    public void run() {
        System.out.println("start thread of " + this.getName());
        for (int i = 20; i > 0; i--)
            System.out.print(i + " ");
    }

    public CountDownThread(String name) {
        super(name);
    }

    public static void main(String[] args) {
        //create a Thread instance and start it. thread will invoke the run() method
        CountDownThread countDownThread = new CountDownThread("count");
        countDownThread.start();
        CountDownThread countDownThread2 = new CountDownThread("count2");
        countDownThread2.start();
        //output:
        /**
         * start thread of count
         * start thread of count2
         * 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 20 19 18 17 2 16 15 14 1 13 12 11 10 9 8 7 6 5 4 3 2 1
         */
    }
}
