class Solution {
    
    TreeNode recur(TreeNode root){
        if(root==null) return null;
        TreeNode left=recur(root.left);
        TreeNode right=recur(root.right);
        TreeNode temp=left;
        root.left=right;
        root.right=temp;
        return root;        
    }
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return root;
        return recur(root);
    }
}