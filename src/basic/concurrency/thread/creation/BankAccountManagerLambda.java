package basic.concurrency.thread.creation;

import basic.concurrency.resourceManager.BankAccountManager;

public class BankAccountManagerLambda {
    private BankAccountManager bankAccountManager;

    public BankAccountManager getBankAccountManager() {
        return bankAccountManager;
    }

    public BankAccountManagerLambda(BankAccountManager bankAccountManager) {
        this.bankAccountManager = bankAccountManager;
    }

    public BankAccountManagerLambda() {
        this(new BankAccountManager());
    }

    public static void main(String[] args) {
        BankAccountManagerLambda bankAccountManagerLambda = new BankAccountManagerLambda();

        BankAccountManager bankAccountManager = bankAccountManagerLambda.getBankAccountManager();
        Runnable task = () -> bankAccountManager.withdraw(50);
        Thread thread = new Thread(task);
        thread.start();
    }
}
