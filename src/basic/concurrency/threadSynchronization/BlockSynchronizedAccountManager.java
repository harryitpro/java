package basic.concurrency.threadSynchronization;

import basic.concurrency.resource.BankAccount;

/**
 * demo to apply synchronized keyword to block.
 */
public class BlockSynchronizedAccountManager {
    private BankAccount bankAccount;

    public BlockSynchronizedAccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean withdraw(double amount, String customer) {
        synchronized (this) {
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
