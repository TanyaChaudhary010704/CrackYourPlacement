package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
    int m = 3, n = 3;
    Solution s = new Solution();
    s.merge(nums1, m, nums2, n);
    System.out.println(nums1);
  }
}
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      
      for(int i=0;i<n;i++){
          nums1[i+m] = nums2[i];
      }
      Arrays.sort(nums1);   
  }
}
