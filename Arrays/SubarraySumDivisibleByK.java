package Arrays;

class Solution {
  public int subarraysDivByK(int[] nums, int K) {
      int[] count = new int[K];
      count[0] = 1;
      int prefix = 0, res = 0;
      for (int num : nums) {
          prefix = (prefix + num % K + K) % K;
          res += count[prefix]++;
      }
      return res;
  }
}
public class SubarraySumDivisibleByK {
  public static void main(String[] args) {
    int nums[] = { 4,5,0,-2,-3,1};
    Solution s = new Solution();
    System.out.println(s.subarraysDivByK(nums,5));
  }
}
