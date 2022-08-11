class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    boolean twosum(TreeNode root,int target){
        if(root==null) return false;
        if(map.containsKey(target-root.val)) return true;
        map.put(root.val,1);
        boolean left=twosum(root.left,target);
        boolean right=twosum(root.right,target);
        return left || right;
    }
    public boolean findTarget(TreeNode root, int k) {
        return twosum(root,k);
    }
}