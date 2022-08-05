class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int len=1;
        ListNode temp=head,front=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        temp.next=head;
        int count=0;
        while(count<(len-k-1)){
            front=front.next;
            count++;
        }
        ListNode fin=front.next;        
        front.next=null;
        return fin;
    }
}