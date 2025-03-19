package basic.operator;

/**
 * How it works?
 */
public class ShiftOperator {
    static void shiftRight() {
        int n = 10;
        System.out.println(n >> 2); //2
    }

    public static void main(String[] args) {
        shiftRight();
    }
}
