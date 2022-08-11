public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
         int floor=0;
        int x=X;
        while(root!=null){
            if(root.data==x){
                return root.data;
            }
            if(root.data>x){
                root=root.left;
            }
            else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }
}