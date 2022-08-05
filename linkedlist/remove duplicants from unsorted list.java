class Solution{
    public Node removeDuplicates(Node head) {
         Node temp=head;
         Node prev=head;
         Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
         while(temp.next!=null){
             if(!map.containsKey(temp.data)){
                 map.put(temp.data,1);
                 prev=temp;
                 temp=temp.next;
             }
             else{
                 prev.next=temp.next;
                 temp=null;
                 temp=prev.next;
                 
             }
         }
         if(!map.containsKey(temp.data)){
                 map.put(temp.data,1);
                 prev=temp;
                 temp=temp.next;
             }
             else{
                 prev.next=temp.next;
                 temp=null;
                 temp=prev.next;
                 
             }
         
         
         return head;
    }
}
/// 1 2 3 4 3 5 --> 1 2 3 4 5
