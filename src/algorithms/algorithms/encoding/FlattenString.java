package algorithms.algorithms.encoding;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class FlattenString {
    /**
     * @param s
     * @return
     */
    static String flatten(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        int currentCount = 0;
        StringBuilder currentString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + ch - '0';
            } else if (ch == '[') {
                countStack.push(currentCount);
                currentCount = 0;

                //push previous string into stack
                stringStack.push(currentString);
                currentString = new StringBuilder();
            } else if (ch == ']') { //popup
                //End of current pattern, popup and build
                StringBuilder decoded = stringStack.pop();
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    decoded.append(currentString);
                }
                currentString = decoded;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        List<String> compressedList = List.of(
                "abc",
                "2[a]3[bc]",
                "2[a3[bc]]"
        );
        compressedList.stream()
                .map(str -> flatten(str))
                .forEach(System.out::println);
        /**
         * output:
         abc
         aabcbcbc
         abcbcbcabcbcbc
         */
    }
}
