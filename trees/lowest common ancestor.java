class Solution {
    int lowest(TreeNode root,TreeNode left,TreeNode right){
        if(root==null) return -99;
        if(root.val==left.val || root.val==right.val) return root.val;
        int l=lowest(root.left,left,right);
        int r=lowest(root.right,left,right);
        if(l!=-99 && r!=-99) return root.val;
        if(l!=-99 && r==-99) return l;
        return r;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return new TreeNode(lowest(root,p,q));
    }
}