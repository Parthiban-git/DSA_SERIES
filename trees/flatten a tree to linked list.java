class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return ;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode curr=root;
        while(!stack.isEmpty()){
            curr=stack.pop();
            if(curr.right!=null) stack.push(curr.right);
            if(curr.left!=null) stack.push(curr.left);
            curr.left=null;
            if(!stack.isEmpty()) curr.right=stack.peek();
        }
    }
}