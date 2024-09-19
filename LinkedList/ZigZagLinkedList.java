class Solution {      
    Node zigZag(Node head) {
        Node next=head.next;
        Node prev=head;
        while(next!=null){
            if(prev.data > next.data){
                int datas = prev.data;
                prev.data = next.data;
                next.data=datas;
                
            }
            prev=next;
            next=next.next;
            if(next!=null && prev.data < next.data){
                int datas = prev.data;
                prev.data = next.data;
                next.data=datas;
                
            }
            if(next!=null ){
                prev=next;
                next=next.next;
            }
            
        }
        return head;
    }
}
