package algorithms.fundamental;

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;  // Get last digit
            rev = rev * 10 + digit;  //build reverse number
            x /= 10;             // Remove last digit from x
        }
        return rev;
    }

    static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(123)); //321
        System.out.println(reverse(-123)); //-321
    }
}
