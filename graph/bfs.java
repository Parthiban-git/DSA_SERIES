class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
         ArrayList<Integer> res=new ArrayList<Integer>();
         boolean visited[]=new boolean[V+1];
         for(int i=0;i<V;i++){
             if(visited[i]==false){
                 Queue<Integer> queue=new LinkedList<Integer>();
                 queue.offer(i);
                 visited[i]=true;
                 while(!queue.isEmpty()){
                     Integer node=queue.poll();
                     res.add(node);
                     for(Integer ad:adj.get(node)){
                         if(visited[ad]==false){
                             queue.offer(ad);
                             visited[ad]=true;
                         }
                     }
                 }
             }
         }
         return res;
    }
}