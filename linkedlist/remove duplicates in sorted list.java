class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode org=head,temp=org,prev=org;
        while(temp!=null){
            if(temp.val==prev.val){
                temp=temp.next;
            }
            else{
                prev.next=temp;
                prev=prev.next;
            }
        }
        prev.next=null;
        return org;
    }
}
// 1 1 2 3 3 --> 1 2 3