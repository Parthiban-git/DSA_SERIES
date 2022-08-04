
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA,t2=headB;
        int len1=0,len2=0;
        while(t1!=null){
            t1=t1.next;
            len1++;
        }
        while(t2!=null){
            len2++;
            t2=t2.next;
        }
        t1=headA;t2=headB;
        int len=Math.abs(len1-len2);
        if(len1>=len2 && t1!=null){
            int count=1;
            while(count<=len){
                t1=t1.next;
                count++;
            }
        }
        else{
            int count=1;
            while(count<=len && t2!=null){
                t2=t2.next;
                count++;
            }
        }
        while(t1!=null && t2!=null){
            if(t1==t2) return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
    // count=1
}