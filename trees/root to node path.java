public class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    boolean recur(TreeNode root,int target){
        if(root==null) return false;
        list.add(root.val);
        if(root.val==target) return true;
        boolean left=recur(root.left,target);
        boolean right=recur(root.right,target);
        if(left==false && right==false){
            list.remove(list.size()-1);
        }       
        return left || right;                
    }
    public int[] solve(TreeNode A, int B) {
        recur(A,B);
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
