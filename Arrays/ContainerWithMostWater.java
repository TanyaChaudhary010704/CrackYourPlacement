package Arrays;

public class ContainerWithMostWater {
  public static void main(String[] args) {
    int nums[] = {1,8,6,2,5,4,8,3,7};
    Solution s = new Solution();
    System.out.println(s.maxArea(nums));
  }
}
class Solution {
  public int maxArea(int[] height) {
      int max = 0;
  int left = 0;
  int right = height.length - 1;
  while (left <= right) {
    int area = 0;
    int b = Math.abs(left - right);
    int l = Math.min(height[left], height[right]);
    area = l * b;
    max = Math.max(area, max);
    if (height[left] < height[right]) {
      left++;
    }
    else {
      right--;
    }
  }
  return max;
  }
}
