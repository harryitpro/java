package algorithms.datasturctures.array;

public class ArrayErrorHandling {
    public void throwExceptionWhenEmptyArray(int[] arr) {
        if ((arr == null) || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null or empty");
        //other process
    }
}
