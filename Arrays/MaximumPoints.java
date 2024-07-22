package Arrays;

public class MaximumPoints {
  public static void main(String[] args) {
    int nums[] = {1,2,3,4,5,6,1};
    Solution s = new Solution();
    System.out.println(s.maxScore(nums, 3));
  }
}
class Solution {
  public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
      int leftSum = 0,rightSum=0;
      int maxSum =0;
      for(int i=0;i<k;i++){
          leftSum +=cardPoints[i];
          maxSum = leftSum;
      }
      for(int i=0;i<k;i++){
          leftSum -= cardPoints[k-1-i];
          rightSum +=cardPoints[n-1-i];
          maxSum = Math.max(maxSum,leftSum+rightSum);
      }
      return maxSum;
  }
}
