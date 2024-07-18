package String;

class Solution {
  public int strStr(String haystack, String needle) {
      int n = haystack.length();
      int m = needle.length();
      for(int i=0;i<=n-m;i++){
          char ch = haystack.charAt(i);
          if(ch==needle.charAt(0)){
              String sub = haystack.substring(i,i+m);
              if(sub.equals(needle)){
                  return i;
              }
          }
      }
      return -1;
  }
}
public class FirstOccurance {
  public static void main(String[] args) {
    String haystack = "leetcode";
    String needle = "leeto";
    Solution s = new Solution();
    System.out.println(s.strStr(haystack, needle));
  } 
}
