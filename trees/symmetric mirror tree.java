class Solution {
    boolean recur(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1!=null && root2==null || root2!=null && root1==null) return false;
        if(root1.val!=root2.val) return false;
        boolean left=recur(root1.left,root2.right);
        boolean right=recur(root1.right,root2.left);
        return left && right;
    }
    public boolean isSymmetric(TreeNode root) {
        return recur(root.left,root.right);
    }
}
// left and right should be equal