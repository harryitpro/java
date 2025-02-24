package pattern.creational;

/**
 * This is the cleanest, fastest, and recommended approach.
 * It uses an inner static helper class, which is loaded only when getInstance() is called.
 */

/**
 * ✅ Thread-safe (Uses JVM class loading)
 * ✅ Lazy initialization (Object is created only when needed)
 * ✅ No synchronization overhead
 */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {
    }

    private static class SingletonHelper {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


