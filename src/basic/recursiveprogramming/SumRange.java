package basic.recursiveprogramming;

/**
 *  *  a method call chain with smaller scope of input
 *  *  unwind till the certain returning condition is met
 */
public class SumRange {
    /**
     * a recursive method.
     * each call will make a smaller scope by increasing from by from++
     * returning condition: from == to
     */
    static int sumRange(int from, int to) {
        if (to == from)
            return to;
        return from + sumRange(++from, to);
    }

    public static void main(String[] args) {
        int sum = sumRange(1, 100);
        System.out.println(sum); //expect 5050
        /**
         * output: 5050
         */
    }
}
