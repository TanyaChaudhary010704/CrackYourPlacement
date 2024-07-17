package Arrays;

class Solution {
  public void moveZeroes(int[] nums) {
    int zeros = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        zeros++;
      } else if (zeros > 0) {
        int temp = nums[i];
        nums[i] = 0;
        nums[i - zeros] = temp;
      }
    }
  }
}

public class MoveZeroes {
  public static void main(String[] args) {
    int nums[] = { 0,1,0,3,12};
    Solution s = new Solution();
    s.moveZeroes(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]+" , ");
    }
  }
}
