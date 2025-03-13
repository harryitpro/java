package algorithms.fundamental;

/**
 * give a string with (), [], {}
 * check if it's valid
 *
 *  * hint: using stack
 *  How it works: push left parentheses to stack.
 *
 */
import java.util.Stack;

public class IsValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);  // Push opening brackets
            } else {
                // If stack is empty or top does not match, return false
                if (stack.isEmpty() || !isMatching(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();  // Stack must be empty for a valid expression
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "(){}[]";
        String test2 = "({[()]})";
        String test3 = "(]";
        String test4 = "({[})]";

        System.out.println(isValid(test1));  // true
        System.out.println(isValid(test2));  // true
        System.out.println(isValid(test3));  // false
        System.out.println(isValid(test4));  // false
    }
}

