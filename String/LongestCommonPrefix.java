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
     
        StringBuilder common = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            common.append(first[i]);
        }
        return common.toString();   
    }
}
