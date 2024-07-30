package LinkedList;

public class ReverseLL {

  public ListNode reverseList(ListNode head) {
      if(head==null || head.next==null){
          return head;
      }
      ListNode r =null, p = head, q=head;
      while(p.next!=null){
          q=p;
          p=p.next;
          q.next = r;
          r=q;
      }
      p.next = q;
      head=p;
      return head;
  }
}
