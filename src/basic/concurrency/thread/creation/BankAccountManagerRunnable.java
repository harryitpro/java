package basic.concurrency.thread.creation;

import basic.concurrency.recourcemanager.BankAccountManager;

/**
 * demo
 * how to implement a Runnable interface.
 * the key: define the specific task. (method to run, either a running block, or a method from an object)
 * how to construct a Thread and start()
 */
public class BankAccountManagerRunnable implements Runnable {
    //set up task
    private BankAccountManager bankAccountManager;

    public BankAccountManagerRunnable(BankAccountManager bankAccountManager) {
        this.bankAccountManager = bankAccountManager;
    }

    @Override
    public void run() {
        bankAccountManager.withdraw(50);
    }

    //Thread client
    public static void main(String[] args) {
        BankAccountManagerRunnable task = new BankAccountManagerRunnable(new BankAccountManager());

        //start a thread
        Thread bankAccountManagerThread = new Thread(task);
        bankAccountManagerThread.start();
    }
}

