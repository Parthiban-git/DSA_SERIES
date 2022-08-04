class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head,slow=head,fast=head;
        int count=0,len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            if(count<n) fast=fast.next;
            else{
                slow=slow.next;
                fast=fast.next;
            }
            count++;
        }
        slow.next=slow.next.next;
        return head;
    }
    // count=0
}