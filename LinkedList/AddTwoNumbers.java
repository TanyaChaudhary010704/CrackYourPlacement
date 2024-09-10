package LinkedList;

public class AddTwoNumbers {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp1=l1;
    ListNode temp2 = l2;
    ListNode head = new ListNode(-1);
    ListNode temp = head;
    int carry =0;
    while(temp1!=null&& temp2!=null){
        int sum = temp1.val+temp2.val+carry;
        carry = sum>9?1:0;
       ListNode newNode = new ListNode(sum%10);
        temp.next = newNode;
        temp = newNode;
        temp1= temp1.next;
        temp2=temp2.next;
    }
    while(temp1!=null){
        int sum = temp1.val+carry;
        carry = sum>9?1:0;
        ListNode newNode = new ListNode(sum%10);
        temp.next = newNode;
        temp = newNode;
        temp1= temp1.next;
    }
    while(temp2!=null){
        int sum = temp2.val+carry;
        carry = sum>9?1:0;
        ListNode newNode = new ListNode(sum%10);
        temp.next = newNode;
        temp = newNode;
        temp2= temp2.next;
    }
    if(carry==1){
        ListNode newNode = new ListNode(1);
        temp.next = newNode;
        temp = newNode;
    }
    return head.next;
  }
}
