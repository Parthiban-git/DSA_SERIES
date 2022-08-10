// longest path between two nodes , it is not that it is via root
class Solution {
    int max=Integer.MIN_VALUE;
    int diameter(TreeNode root){
        if(root==null) return 0;
        int left=diameter(root.left);
        int right=diameter(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
}
