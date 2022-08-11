class Solution {
    TreeNode create(int nums[],int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(nums,low,mid-1);
        root.right=create(nums,mid+1,high);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
}