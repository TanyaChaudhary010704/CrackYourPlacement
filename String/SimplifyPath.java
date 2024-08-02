package String;

import java.util.ArrayList;
import java.util.Stack;
public class SimplifyPath {
  public static void main(String[] args) {
    System.out.println(simplifyPath("/a/./b/../../c/"));
  }

  public static String simplifyPath(String path) {
    String[] str = path.split("/");
    Stack<String> st = new Stack<>();
    
    for (String s : str) {
      if (s.equals("..")) {
        if (!st.empty()) {
          st.pop();
        }
      } else if (!s.equals(".") && !s.equals("")) {
        st.push(s);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (String s : st) {
      sb.append("/").append(s);
    }
    return sb.length() > 0 ? sb.toString() : "/";
  }
}
