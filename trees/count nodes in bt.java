class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=leftheight(root.left);
        int right=rightheight(root.right);
        if(left==right) return (2<<left)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    int leftheight(TreeNode root){
        int count=0;
        while(root!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    int rightheight(TreeNode root){
        int count=0;
        while(root!=null){
            count++;
            root=root.right;
        }
        return count;
    }
}