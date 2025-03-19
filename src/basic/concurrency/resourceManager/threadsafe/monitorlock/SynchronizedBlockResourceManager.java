package basic.concurrency.resourceManager.threadsafe.monitorlock;

import basic.concurrency.resourceManager.BankAccount;

/**
 * demo to apply synchronized keyword to block.
 */
public class SynchronizedBlockResourceManager {
    private BankAccount bankAccount;

    public SynchronizedBlockResourceManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean withdraw(double amount, String customer) {
        synchronized (this) {//It creates a monitor lock on the current object (this)
            double balance = bankAccount.getBalance();
            if (balance >= amount) {
                balance = balance - amount;
                bankAccount.setBalance(balance);
                System.out.println(customer + " successfully withdrew $" + amount +
                        " (New balance: $" + balance + ")");
                return true;
            }
        }
        return false;
    }
}
