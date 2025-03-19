package basic.concurrency.recourcemanager;

import basic.concurrency.resource.BankAccount;

/**
 * Not Thread safety
 */
public class BankAccountManager {
    private BankAccount bankAccount;

    public BankAccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccountManager() {
        this(new BankAccount());
    }

    public boolean withdraw(double amount) {
        double balance = bankAccount.getBalance();
        if (balance >= amount) {
            bankAccount.setBalance(balance - amount);
            System.out.println("Successfully withdraw!");
            return true;
        } else {
            System.out.println("No enough Fund!");
            return false;
        }
    }
}
