package Arrays;
import java.util.ArrayList;
public class FindAllDuplicates {
  public static void main(String[] args) {
    int nums[] = { 7,1,5,3,6,4};
    Solution s = new Solution();
    System.out.println(s.findDuplicates(nums));
  }
}
class Solution {
  public ArrayList<Integer> findDuplicates(int[] nums) {
      ArrayList<Integer> ans = new ArrayList<>();
      int n = nums.length;
      for (int i = 0; i < n; i++) {
          int x = Math.abs(nums[i]);
          if (nums[x - 1] < 0) {
              ans.add(x);
          }
          nums[x - 1] *= -1;
      }
      return ans;
  }
}