package basic.concurrency.realworld.bankaccount;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized boolean withdraw(double amount, String customer) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(customer + " successfully withdrew $" + amount +
                    " (New balance: $" + balance + ")");
            return true;
        }
        return false;
    }
}
