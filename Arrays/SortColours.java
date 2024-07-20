package Arrays;

public class SortColours {
  public static void main(String[] args) {
    int nums[] = { 0,1,0,1,2,2};
    Solution s = new Solution();
    s.sortColors(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" , ");
    }
  }
}
class Solution {
  public void sortColors(int[] nums) {
      int zeros = 0, ones = 0, n = nums.length;
      for(int num : nums) {
          if(num == 0) zeros++;
          else if(num == 1) ones++;
      }  

      for(int i = 0; i < zeros; ++i) {
          nums[i] = 0;
      }

      for(int i = zeros; i < zeros + ones; ++i) {
          nums[i] = 1;
      }

      for(int i = zeros + ones; i < n; ++i) {
          nums[i] = 2;
      }
  }
}
