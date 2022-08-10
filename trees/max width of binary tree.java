
class Pair{
    TreeNode root;
    int num;
    Pair(TreeNode root,int num){
        this.root=root;
        this.num=num;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int maxwidth=0;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            int first=0,last=0,tot=queue.peek().num;
            for(int i=0;i<size;i++){
                int curr=queue.peek().num-tot;
                Pair pair=queue.poll();
                TreeNode node=pair.root;
                if(i==0){
                    first=curr;
                }
                if(i==size-1){
                    last=curr;
                }
                if(node.left!=null){
                    queue.offer(new Pair(node.left,2*curr+1));
                }
                if(node.right!=null){
                    queue.offer(new Pair(node.right,2*curr+2));
                }
            }
            maxwidth=Math.max(maxwidth,last-first+1);
        }
        return maxwidth;        
    }
}