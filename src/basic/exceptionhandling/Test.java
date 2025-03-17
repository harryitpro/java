package basic.exceptionhandling;

public class Test {

    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
    //output: Arithmetic Exception
}

