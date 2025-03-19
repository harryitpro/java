package basic.concurrency.resourceManager;

/**
 * demo to apply synchronized keyword to block.
 */
public class SynchronizedBlockBankAccountManager {
    private BankAccount bankAccount;

    public SynchronizedBlockBankAccountManager(BankAccount bankAccount) {
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
