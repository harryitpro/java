package basic.concurrency.thread.creation;

import basic.concurrency.resourceManager.BankAccountManager;


/**
 * implicit implement Runnable function interface through Lambda
 */
public class BankAccountWithdrawRunnableLambdaImpl {
    private BankAccountManager bankAccountManager;

    static void execute() {
        BankAccountWithdrawRunnableLambdaImpl bankAccountWithdrawRunnableLambdaImpl = new BankAccountWithdrawRunnableLambdaImpl();
        BankAccountManager bankAccountManager = bankAccountWithdrawRunnableLambdaImpl.getBankAccountManager();

        Runnable task = () -> bankAccountManager.withdraw(50);

        Thread thread = new Thread(task);
        thread.start();
    }

    public static void main(String[] args) {
        execute();
    }

    public BankAccountManager getBankAccountManager() {
        return bankAccountManager;
    }

    public BankAccountWithdrawRunnableLambdaImpl(BankAccountManager bankAccountManager) {
        this.bankAccountManager = bankAccountManager;
    }

    public BankAccountWithdrawRunnableLambdaImpl() {
        this(new BankAccountManager());
    }
}
