class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head,start=p.next;
        while(p!=null && p.next!=null){
            ListNode q=p.next;
            ListNode temp=q.next;
            q.next=p;
            if(temp==null || temp.next==null){
                p.next=temp;
                break;
            }
            p.next=temp.next;
            p=temp;
        }
        return start;
    }
}