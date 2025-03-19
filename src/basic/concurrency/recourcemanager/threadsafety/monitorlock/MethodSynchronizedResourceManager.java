package basic.concurrency.recourcemanager.threadsafety.monitorlock;

import basic.concurrency.resource.BankAccount;

/**
 * demo synchronized method
 */
public class MethodSynchronizedResourceManager {
    private BankAccount bankAccount;

    public MethodSynchronizedResourceManager(BankAccount bankAccount) {
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
