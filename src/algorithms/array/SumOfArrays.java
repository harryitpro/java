package algorithms.array;

public class SumOfArrays {
    static int sum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array is empty or null");
        }
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return sum;
    }

    static int max(int[] arr) {
        //empty or null check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        //init place-holder value to the first one
        int max = arr[0];
        //compare and compute
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        //return value
        return max;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        System.out.println("sum(arr) = " + sum(intArr));//15

        int[] emptyArr = new int[]{};
        // Exception in thread "main" java.lang.IllegalArgumentException: array is empty or null
        try {
            System.out.println("sum(emptyArr) = " + sum(emptyArr));
        } catch (Exception e) {
            //skip exception
        }
    }
}
