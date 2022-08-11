class Colution{
int count=0,res=-1;
    void recur(Node root,int k){
        if(root==null) return ;
        recur(root.right,k);
        count++;
        if(count==k) res=root.data;
        recur(root.left,k);
    }
    public int kthLargest(Node root,int K){
        recur(root,K);
        return res;
    }
}