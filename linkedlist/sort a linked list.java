class Solution {
    ListNode merge(ListNode list1,ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy=new ListNode(-1);
        ListNode glob=dummy;
        while(list1!=null && list2!=null){
            if(list1.val>=list2.val){
                dummy.next=list2;
                dummy=dummy.next;
                list2=list2.next;
            }
            else{
                dummy.next=list1;
                dummy=dummy.next;
                list1=list1.next;
            }
        }
        if(list1!=null) dummy.next=list1;
        if(list2!=null) dummy.next=list2;
        return glob.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head,fast=head,temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode list1=sortList(head);
        ListNode list2=sortList(slow);
        return merge(list1,list2);
    }
}
// merge sort