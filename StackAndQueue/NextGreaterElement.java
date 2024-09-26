class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] ng = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = nums2[s.peek()];
            }
            s.push(i);
        }
        int result[] = new int[nums1.length];
        int x=0;
        for(int e:nums1){
            int j=0;
            while(nums2[j]!=e){
                j++;
            }
            result[x++]= ng[j];
        }
        return result;
    }
}
