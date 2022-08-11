class Solution {
    TreeNode buildtree(int inorder[],int instart,int inend,int preorder[],int prestart,int preend,Map<Integer,Integer> inmap){
        if(prestart>preend || instart>inend) return null;
        TreeNode root=new TreeNode(preorder[prestart]);
                
        int inroot=inmap.get(root.val);
        int inleft=inroot-instart;
        //
        root.left=buildtree(inorder,instart,inroot-1,preorder,prestart+1,prestart+inleft,inmap);
        //
        root.right=buildtree(inorder,inroot+1,inend,preorder,prestart+inleft+1,preend,inmap);
        //
        return root;
    }
    //////
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inmap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        return buildtree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,inmap);
    }
}