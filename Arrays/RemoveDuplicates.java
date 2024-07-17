package Arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array
//Day-1
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 ,2,3,4,5,5};
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(nums));
    }
}
