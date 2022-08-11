
    class Solution
    {
        ArrayList<Integer> res=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        
        boolean isleaf(Node node){
            if(node.left==null && node.right==null){
                return true;
            }
            else{
                return false;
            }
        }
        /////
        
        void leftboundary(Node root){
            res.add(root.data);
            root=root.left;
            while(root!=null){
                if(isleaf(root)==false){
                    res.add(root.data);
                }
                if(root.left!=null){
                    root=root.left;
                }
                else{
                    root=root.right;
                }
            }
        }
        ////
        void leaf(Node root){
            if(root==null){
                return ;
            }
            if(isleaf(root)==true){
                res.add(root.data);
            }
            leaf(root.left);
            leaf(root.right);
        }
        // ////
        void rightboundary(Node root){
            Node node=root.right;
            while(node!=null){
                if(isleaf(node)==false){
                    right.add(node.data);
                }
                if(node.right!=null){
                    node=node.right;
                }
                else{
                    node=node.left;
                }
            }
            for(var i=right.size()-1;i>=0;i--){
                res.add(right.get(i));
            }
        }
        
        /////////
        
        ArrayList <Integer> boundary(Node node){
            if(node==null){
               return res; 
            } 
            if(node.left==null && node.right==null){
                res.add(node.data);
                return res;
            }
            leftboundary(node);
            leaf(node);
            rightboundary(node);
            return res;
        }
    }
    