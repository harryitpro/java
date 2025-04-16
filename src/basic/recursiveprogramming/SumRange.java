package basic.recursiveprogramming;

//recursive: a method call chain, unwind when the returning condition is met
public class SumRange {
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
