package algorithms.fundamental;

/**
 * regard String as a collection of chars.
 * string.toCharArray -> char[] chars = string.toCharArray()
 * visit each char using index: string.charAt()
 */
public class ReverseString {
    static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "this is a string";
        System.out.println(reverse(s));  //gnirts a si siht
    }
}