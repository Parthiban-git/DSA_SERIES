class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,nex=head,prev=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
}