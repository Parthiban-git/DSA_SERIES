class Solution {
    int max=Integer.MIN_VALUE;
    int recur(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,recur(root.left));
        int right=Math.max(0,recur(root.right));
        max=Math.max(max,root.val+left+right);
        return root.val+Math.max(left,right);
        
    }
    public int maxPathSum(TreeNode root) {
        recur(root);
        return max;
    }
}

// similar like diameter of binary tree