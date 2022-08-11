public class Solution {
    public  static int findCeil(TreeNode<Integer> node, int x) {
        int ceil=0;
        while(node!=null){
            if(node.data==x){
                return node.data;
            }
            if(node.data>x){
                ceil=node.data;
                node=node.left;
            }
            else{
                node=node.right;
            }
        }
        return ceil;
    }
}
