class Pair{
      TreeNode node;
      int hd;
      Pair(TreeNode node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Queue<Pair> queue=new LinkedList<Pair>();
        Map<Integer,PriorityQueue<Integer>> map=new TreeMap<Integer,PriorityQueue<Integer>>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            int k=queue.size();
            while(k>0){
                Pair pair=queue.poll();
                int hd=pair.hd;
                TreeNode node=pair.node;
                if(map.containsKey(hd)){
                    PriorityQueue<Integer> lis;
                    lis=map.get(hd);
                    lis.offer(node.val);
                    map.put(hd,lis);
                }
                else if(!map.containsKey(hd)){
                    PriorityQueue<Integer> lis=new PriorityQueue<Integer>();
                    lis.offer(node.val);
                    map.put(hd,lis);
                }
                if(node.left!=null){
                    queue.offer(new Pair(node.left,hd-1));
                }
                if(node.right!=null){
                    queue.offer(new Pair(node.right,hd+1));
                }
                k--;
            }
        }
        for(Map.Entry entry:map.entrySet()){
            List<Integer> lis=new ArrayList<Integer>();
            PriorityQueue q=(PriorityQueue)entry.getValue();
            while(!q.isEmpty()){
                lis.add((int)q.poll());
            }
            res.add(lis);
        }
        return res;
    }
}