package basic.functionalprogramming.LambdaExpression;

/**
 * public abstract void run();
 *
 * example:
 * Creating a Thread using Runnable Interface
 */
public class RunnableInterface {
    public Runnable implementRunnableInterface() {
        Runnable runnable = () -> System.out.println("Runnable functional interface implementation");
        return runnable;
    }
}
