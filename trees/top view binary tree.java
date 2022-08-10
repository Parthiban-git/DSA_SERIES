class Solution
{
   static class Pair{
       int hd;
       Node node;
       Pair(int hd,Node node){
           this.hd=hd;
           this.node=node;
       }
   }
    static ArrayList<Integer> topView(Node root)
    {
       Map<Integer,Integer> map=new TreeMap<Integer,Integer>(); 
       Queue<Pair> queue=new LinkedList<Pair>();
       queue.offer(new Pair(0,root));
       while(!queue.isEmpty()){
           int k=queue.size();
           while(k>0){
               Pair pair=queue.poll();
               Node node=pair.node;
               int hd=pair.hd;
               if(!map.containsKey(hd)){
                   map.put(hd,node.data);
               }
               if(node.left!=null){
                   queue.offer(new Pair(hd-1,node.left));
               }
               if(node.right!=null){
                   queue.offer(new Pair(hd+1,node.right));
               }
               k--;
           }
       }
       ArrayList list=new ArrayList<Integer>();
       for(Map.Entry entry:map.entrySet()){
           list.add((int)entry.getValue());
       }
       return list;
    }
}
