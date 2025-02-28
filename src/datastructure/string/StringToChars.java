package datastructure.string;

import java.util.Arrays;

public class StringToChars {
    //transform String to char[]

    /**
     * this transformation can be used for char array sorting.
     */
    static char[] toCharArray() {
        String str = "hello";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray)); //[e, h, l, l, o]
        return charArray;
    }

    //String constructor with char array argument
    static String convertCharArrayToString(char[] arr) {
        String s1 = new String(arr);
        System.out.println(s1);
        String s2 = String.valueOf(arr);
        System.out.println(s2);
        System.out.println("s1 == s2 ? " + s1 == s2);
        System.out.println("s1.equals(s2) ? " + s1.equals(s2));
        return s1;
    }


    public static void main(String[] args) {
        toCharArray();
        convertCharArrayToString(new char[]{'a','b'});
    }
}
