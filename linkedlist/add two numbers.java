class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        int carry=0;
        while(l1!=null && l2!=null){
            int ans=l1.val+l2.val+carry;
            carry=ans/10;
            temp.next=new ListNode(ans%10);
            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
        }
        while(l1!=null){
            int ans=l1.val+carry;
            carry=ans/10;
            temp.next=new ListNode(ans%10);
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            int ans=l2.val+carry;
            carry=ans/10;
            temp.next=new ListNode(ans%10);
            l2=l2.next;
            temp=temp.next;
        }
        if(carry>0) temp.next=new ListNode(carry);
        return head.next;        
    }
}
