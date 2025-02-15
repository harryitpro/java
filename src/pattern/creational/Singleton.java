package pattern.creational;

/**
 * address only One instance is in use for the entire application
 * Example: Arrays utility's asList()
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //private constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //verify
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1 == singleton2 ?" + (singleton1 == singleton2));
        singleton1.showMessage();
    }
}
