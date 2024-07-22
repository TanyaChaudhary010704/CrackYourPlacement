package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
  public static void main(String[] args) {
    int nums[] = { 4,5,0,-2,-3,1};
    Solution s = new Solution();
    System.out.println(s.subarraySum(nums,5));
  }
}
class Solution {
  public int subarraySum(int[] nums, int k) {
      int sum=0,result=0;
      Map<Integer,Integer>preSum=new HashMap<>();
      preSum.put(0,1);
      for(int num:nums){
          sum+=num;
          if(preSum.containsKey(sum-k)){
              result+=preSum.get(sum-k);
          }
          preSum.put(sum,preSum.getOrDefault(sum,0)+1);
      }
      return result;
  }
}
