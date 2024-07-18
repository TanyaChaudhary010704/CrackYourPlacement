package Arrays;

class Solution {
  public int subarraysDivByK(int[] nums, int k) {
    int count[] = new int[k];
    count[0]=1;
    int cummulativeSum =0;
    int answer=0;
    for(int num : nums){
        cummulativeSum+= num;
        int remainder = cummulativeSum%k;
        if(remainder<0){
            remainder +=k;
        }
        answer +=count[remainder];
        count[remainder]++;
    }
    return answer;
  }
}
public class SubarraySumDivisibleByK {
  public static void main(String[] args) {
    int nums[] = { 4,5,0,-2,-3,1};
    Solution s = new Solution();
    System.out.println(s.subarraysDivByK(nums,5));
  }
}
