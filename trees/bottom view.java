
class Solution
{
    static class Pair{
        int hd;
        Node node;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    static ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        Queue<Pair> queue=new LinkedList<Pair>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            int k=queue.size();
            while(k>0){
                Pair pair=queue.poll();
                int hd=pair.hd;
                Node node=pair.node;
                map.put(hd,node.data);
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
            list.add((int)entry.getValue());
        }
        return list;
    }
}
