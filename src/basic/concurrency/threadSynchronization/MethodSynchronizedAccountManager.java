package basic.concurrency.threadSynchronization;

import basic.concurrency.resource.BankAccount;

/**
 * demo synchronized method
 */
public class MethodSynchronizedAccountManager {
    private BankAccount bankAccount;

    public MethodSynchronizedAccountManager(BankAccount bankAccount) {
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
