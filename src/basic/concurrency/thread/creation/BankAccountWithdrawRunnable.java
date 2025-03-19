package basic.concurrency.thread.creation;

import basic.concurrency.resourceManager.BankAccountManager;

/**
 * demo
 * how to implement a Runnable interface.
 * the key: define the specific task. (method to run, either a running block, or a method from an object)
 * how to construct a Thread and start()
 */
public class BankAccountWithdrawRunnable implements Runnable {
    //set up task
    private BankAccountManager bankAccountManager;

    public BankAccountWithdrawRunnable(BankAccountManager bankAccountManager) {
        this.bankAccountManager = bankAccountManager;
    }

    @Override
    public void run() {
        bankAccountManager.withdraw(50);
    }

    //Thread client
    public static void main(String[] args) {
        BankAccountWithdrawRunnable task = new BankAccountWithdrawRunnable(new BankAccountManager());

        //start a thread
        Thread bankAccountManagerThread = new Thread(task);
        bankAccountManagerThread.start();
    }
}

