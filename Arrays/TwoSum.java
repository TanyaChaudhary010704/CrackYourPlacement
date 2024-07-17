package Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int nums[] = { 2,7,4,3};
    Solution s = new Solution();
    int result[] = s.twoSum(nums,9);
    System.out.print(result[0]+",");
    System.out.print(result[1]);

  }
}
class Solution {
  public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++) {
              if (nums[i] + nums[j] == target) {
                  return new int[]{i, j};
              }
          }
      }
      return new int[]{};
  }
}
