class GfG{
    Node merge(Node left,Node right){
        Node temp=new Node(-1);
        Node res=temp;
        while(left!=null && right!=null){
            if(left.data>=right.data){
                temp.bottom=right;
                temp=temp.bottom;
                right=right.bottom;
            }
            else{
                temp.bottom=left;
                temp=temp.bottom;
                left=left.bottom;
            }
        }
        if(left!=null){
            temp.bottom=left;
        }
        if(right!=null){
            temp.bottom=right;
        }
        return res.bottom;
    }
    Node flatten(Node root){
	     if(root==null || root.next==null) return root;
	     Node next=flatten(root.next);
	     Node res=merge(root,next);
	     return res;
    }
}