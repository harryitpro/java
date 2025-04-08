package algorithms.fundamental;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ParenthesesValidator {
    private Map<Character, Character> pairs;

    public ParenthesesValidator() {
        pairs = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            // Check for opening parentheses
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for closing parentheses
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || pairs.get(stack.pop()) != c) {
                    return false;
                }
            }
            // Ignore non-parentheses characters
        }
        // Ensure all opening parentheses were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesesValidator validator = new ParenthesesValidator();
        String[] testCases = {
                "(qwsd){}[]",  // true
                "({[()]})",    // true
                "(]",          // false
                "({[})]",      // false
                "(",           // false (unmatched opening)
                "abc",         // true (no parentheses)
                "((()))"       // true (nested)
        };

        for (String test : testCases) {
            System.out.println("Input: " + test + " → Valid: " + validator.isValid(test));
        }
    }
}