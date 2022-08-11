class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        Map<Integer,Integer> inmap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inmap);
    }
    TreeNode buildTree(int inorder[],int instart,int inend,int postorder[],int poststart,int postend,
                      Map<Integer,Integer> inmap){
        
        if(instart>inend || poststart>postend) return null;
        TreeNode root=new TreeNode(postorder[postend]);
        
        int index=inmap.get(postorder[postend]);
        int numsleft=index-instart;
        
        root.left=buildTree(inorder,instart,index-1,postorder,poststart,poststart+numsleft-1,inmap);
        
        root.right=buildTree(inorder,index+1,inend,postorder,poststart+numsleft,postend-1,inmap);
        return root;        
        
    }
    
}