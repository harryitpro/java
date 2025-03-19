package basic.concurrency.resourceManager;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBankAccountManager {
    private BankAccount bankAccount;
    private final Lock lock = new ReentrantLock();

    public LockBankAccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public LockBankAccountManager() {
        this.bankAccount = new BankAccount();
    }

    public boolean withDraw(double amount) {
        lock.lock();
        try {
            if (bankAccount.getBalance() >= amount) {
                bankAccount.setBalance(bankAccount.getBalance() - amount);
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }
}
