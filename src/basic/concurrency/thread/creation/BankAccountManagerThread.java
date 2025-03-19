package basic.concurrency.thread.creation;

import basic.concurrency.resourceManager.BankAccountManager;

/**
 * demo
 * how to create a thread with given task.
 * how to invoke the thread by a client. (here is the main() method)
 */
public class BankAccountManagerThread extends Thread {
    //set up task
    private BankAccountManager bankAccountManager;

    public BankAccountManagerThread(BankAccountManager bankAccountManager) {
        this.bankAccountManager = bankAccountManager;
    }

    @Override
    public void run() {
        bankAccountManager.withdraw(50);
    }

    //Thread client
    public static void main(String[] args) {
        BankAccountManagerThread thread = new BankAccountManagerThread(new BankAccountManager());
        thread.start();
    }
}

