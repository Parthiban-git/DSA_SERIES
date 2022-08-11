
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr=root;
        if(curr.val==val) return curr;
        while(curr!=null){
            if(val>curr.val){
                curr=curr.right;
            }
            else if(val<curr.val) curr=curr.left;
            else return curr;
        }
        return curr;
    }
}