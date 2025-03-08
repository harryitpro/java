package algorithms.string.basic;

/**
 * regard String as a collection of chars.
 * string.toCharArray -> char[] chars = string.toCharArray()
 * visit each char using index: string.charAt()
 */
public class ReverseString {
    String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }

    String ReverseStringArray(String str) {
        char[] chars = str.toCharArray();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println("Reversed: " + reversed);
        return reversed;
    }


}


