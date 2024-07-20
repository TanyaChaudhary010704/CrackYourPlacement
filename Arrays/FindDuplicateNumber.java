package Arrays;

public class FindDuplicateNumber {
  public static void main(String[] args) {
    int nums[] = { 7,1,5,3,6,4};
    Solution s = new Solution();
    System.out.println(s.findDuplicate(nums));
  }
}
class Solution {
  public int findDuplicate(int[] nums) {
      //Using cyclic sort
      int i=0;
      while(i<nums.length){
          int correctI = nums[i]-1;
          if(nums[i]==i+1){
              i++;
          }
          else if(nums[correctI]==nums[i]){
              return nums[i];
          }
          else{
              int temp=nums[i];
              nums[i]=nums[correctI];
              nums[correctI]=temp;
          }
      }
      return -1;
  }
}
