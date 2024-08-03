package Backtracking;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Subsets2 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(nums);
      backtrack(nums, 0, new ArrayList<>(), result);
      return result;
  }
  private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
      result.add(new ArrayList<>(path));
      for (int i = start; i < nums.length; i++) {
          if (i > start && nums[i] == nums[i - 1]) continue;
          path.add(nums[i]);
          backtrack(nums, i + 1, path, result);
          path.remove(path.size() - 1);
      }
  }
}
