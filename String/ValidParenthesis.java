package String;
import java.util.Stack;
public class ValidParenthesis{
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else if ((ch == ')' && stack.peek() == '(') ||
                    (ch == '}' && stack.peek() == '{') ||
                    (ch == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
      }
}