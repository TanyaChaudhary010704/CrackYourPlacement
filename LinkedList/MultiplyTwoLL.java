package LinkedList;

public class MultiplyTwoLL {
  class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
  public long multiplyTwoLists(Node first, Node second) {
      // Code here
      int M = 1000000007;
      long num1 =0,num2=0;
      while(first!=null){
          num1 = (num1*10+first.data)%M;
          first=first.next;
      }
      while(second!=null){
          num2 = (num2*10+second.data)%M;
          second=second.next;
      }
      return (num1*num2)%M;
  }
}
