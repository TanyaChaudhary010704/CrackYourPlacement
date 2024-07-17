package String;
import java.util.Stack;
class Solution {
  public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      for(char ch : s.toCharArray()){
          if(ch=='('||ch=='{'|| ch=='['){
              stack.push(ch);
          }
          else if(stack.isEmpty()){
              return false;
          }
          else if((ch==')'&&stack.peek()=='(')||
                  (ch=='}'&&stack.peek()=='{')||
                  (ch==']'&&stack.peek()=='[')){
              stack.pop();
          }
          else{
              stack.push(ch);
          }
      }
      if(stack.isEmpty()){
          return true;
      }
      return false;
  }
}

public class ValidParenthesis {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isValid("([])"));
  }
}