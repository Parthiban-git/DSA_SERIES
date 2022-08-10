class Tree
{
    ArrayList<Integer> list=new ArrayList<Integer>();
    void recur(ArrayList<Integer> list,Node root,int level){
        if(root==null) return ;
        if(level==list.size()){
            list.add(root.data);
        }
        recur(list,root.left,level+1);
        recur(list,root.right,level+1);
    }
    ArrayList<Integer> leftView(Node root){
         if(root==null) return list;
         recur(list,root,0);
         return list;
    }
}