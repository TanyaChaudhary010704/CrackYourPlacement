package Arrays;
import java.util.Arrays;
public class MajorityElement {
  public static void main(String[] args) {
    int[] nums = {1,2,3,0,0,0};
    Solution s = new Solution();
    System.out.println(s.majorityElement(nums));
  }
}
class Solution {
  public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      return nums[n/2];
  }
}
