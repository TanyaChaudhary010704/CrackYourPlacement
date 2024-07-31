package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLL {
    class ListNode
{
    int data;
    ListNode next;
    ListNode(int data) {
        this.data=data;
        this.next = null;
    }
}
  public boolean isPalindrome(ListNode head) {
      List<Integer> list = new ArrayList<>();
      while(head != null) {
          list.add(head.val);
          head = head.next;
      }
      
      int left = 0;
      int right = list.size()-1;
      while(left < right && list.get(left) == list.get(right)) {
          left++;
          right--;
      }
      return left >= right;
  }
}
