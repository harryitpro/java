package basic.concurrency.resourceManager.threadsafe.monitorlock;

import basic.concurrency.resourceManager.BankAccount;

/**
 * demo synchronized method
 */
public class SynchronizedMethodResourceManager {
    private BankAccount bankAccount;

    public SynchronizedMethodResourceManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public synchronized boolean withdraw(double amount, String customer) {
        double balance = bankAccount.getBalance();
        if (balance >= amount) {
            balance = balance - amount;
            bankAccount.setBalance(balance);
            System.out.println(customer + " successfully withdrew $" + amount +
                    " (New balance: $" + balance + ")");
            return true;
        }
        return false;
    }
}
