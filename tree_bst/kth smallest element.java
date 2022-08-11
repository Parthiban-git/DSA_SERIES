class Solution {
    int count=0,ans=0;
    void ans(TreeNode root,int k){
        if(root==null) return ;
        ans(root.left,k);
        count++;
        if(count==k) ans=root.val;
        ans(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        ans(root,k);
        return ans;
    }
}