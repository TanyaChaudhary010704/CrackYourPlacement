package Arrays;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    int nums[] = { 1, 1, 2 ,2,3,4,5,5};
    Solution s = new Solution();
    System.out.println(s.removeDuplicates(nums));
  }
}
class Solution {
  public int removeDuplicates(int[] nums) {
      int idx =1;
      for(int i=1;i<nums.length;i++){
          if(nums[i]!=nums[i-1]){
              nums[idx++]=nums[i];
          } 
      }
      return idx;
  }
}
