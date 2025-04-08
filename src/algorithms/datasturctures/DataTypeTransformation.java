package algorithms.datasturctures;

import java.util.Arrays;
import java.util.List;

public class DataTypeTransformation {
    //convert array to list: use Arrays.asList(array);
    static List<Integer> fromArrayToList(Integer[] arr) {
        return Arrays.asList(arr);
    }

    //convert list to array
    static Integer[] fromListToArray(List<Integer> list) {
        return list.toArray(new Integer[list.size()]);
    }

    //Subtracting '0' to get int value of a character
    static int charToInt(char c) {
        return c - '0';
    }

    //addition '0' to get char unicode of a digit
    static char intToChar(int n) {
        return (char) (n + '0');
    }

}
