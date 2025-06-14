package Strings;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{}[]()";
        System.out.println(isValid(str));  // Output: true
    }
}
