
class Solution {
    ListNode reverse(ListNode nod){
        ListNode prev=null,curr=nod,nex=nod;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head,start=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(start.val!=slow.val) return false;
            slow=slow.next;
            start=start.next;
        }
        return true;
        
    }
}