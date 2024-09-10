package LinkedList;

public class DeleteNodesHavingGreaterValueOnRight {
  class Node {
    int data;
    Node next;
 
   Node(int data) {
       this.data = data;
   }
  }
  Node compute(Node head) {
    head = reverse(head);
    Node temp = head;
    while(temp!=null && temp.next!=null){
        if(temp.data>temp.next.data){
            temp.next = temp.next.next;
        }
        else{
            temp = temp.next;
        }
    }
    return reverse(head);
  }
  Node reverse(Node head){
      if(head==null || head.next == null){
          return head;
      }
      Node rest = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return rest;
  }
}
