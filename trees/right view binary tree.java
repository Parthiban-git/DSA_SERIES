class Solution {
    List<Integer> res=new ArrayList<Integer>();
    void recur(int level,TreeNode root){
        if(root==null) return ;
        if(res.size()==level) res.add(root.val);
        recur(level+1,root.right);
        recur(level+1,root.left);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return res;
        recur(0,root);
        return res;
    }
}