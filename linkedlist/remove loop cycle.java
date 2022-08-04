class Solution{
    public static void removeLoop(Node head){
          Node slow=head,fast=head,prev=null;
          boolean cycle=false;
          while(fast!=null && fast.next!=null){
              slow=slow.next;
              prev=fast.next;
              fast=fast.next.next;
              if(slow==fast){
                  cycle=true;
                  slow=head;
                  break;
              }
          }
          if(cycle==true){
              while(slow!=fast){
                  slow=slow.next;
                  fast=fast.next;
                  prev=prev.next;
              }
              prev.next=null;
          }
          
    }
}