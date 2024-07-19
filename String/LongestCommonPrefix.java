package String;

import java.util.Arrays;
public class LongestCommonPrefix {
  public static void main(String[] args) {
    String[] strs = {"flo"};
    Solution s = new Solution();
    System.out.println(s.longestCommonPrefix(strs));
  } 
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String temp = strs[0];
        int m = temp.length();
        for (int i=1;i<n;i++){
            String curr = strs[i];
            int c=0,t=0;
            while(t<m){
                if(temp.charAt(t)!=curr.charAt(c)) break;
                else{
                    t++;
                    c++;
                } 
            }
            temp = temp.substring(0,t);
            m = t;
        }
        return temp;
    }
}
