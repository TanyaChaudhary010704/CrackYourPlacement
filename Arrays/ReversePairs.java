package Arrays;
import java.util.ArrayList;
public class ReversePairs {
  public static void main(String[] args) {
    int nums[] = { 1, 3,2,3,1};
    System.out.println(reversePairs(nums));
  }

  public static int reversePairs(int[] nums) {
    return mergeSort(nums, 0, nums.length - 1);
  }

  public static int mergeSort(int[] nums, int low, int high) {
    if (low >= high)
      return 0;
    int mid = (low + high) / 2;
    int inv = mergeSort(nums, low, mid);
    inv += mergeSort(nums, mid + 1, high);
    inv += merge(nums, low, mid, high);
    return inv;
  }

  public static int merge(int[] nums, int low, int mid, int high) {
    int count = 0;
    //count pairs
    int j = mid + 1;
    for (int i = low; i <= mid; i++) {
      while (j <= high && nums[i] > 2 * (long) nums[j]) {
        j++;
      }
      count += (j - (mid + 1));
    }
    ArrayList<Integer> temp = new ArrayList<Integer>();
    //merge
    int left = low, right = mid + 1;
    while (left <= mid && right <= high) {
      if (nums[left] <= nums[right]) {
        temp.add(nums[left++]);
      } else {
        temp.add(nums[right++]);
      }
    }
    while (left <= mid) {
      temp.add(nums[left++]);
    }
    while (right <= high) {
      temp.add(nums[right++]);
    }
    //update nums
    for (int i = low; i <= high; i++) {
      nums[i] = temp.get(i - low);
    }
    return count;
  }
}
