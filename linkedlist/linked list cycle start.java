public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head,start=head;
        boolean presence=false;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                presence=true;break;
            }
        }
        if(presence==true){
            while(slow!=start){
                slow=slow.next;
                start=start.next;
            }
            return slow;
        }
        return null;
    }
}