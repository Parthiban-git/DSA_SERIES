class Solution {
    static int ans=Integer.MIN_VALUE;
    static void longest(int mat[][],int n,int m,int row,int col,int desx,int desy,int length,boolean visited[][]){
        if(row==desx && col==desy){
            ans=Math.max(ans,length);
            return ;
        }
        if(row<0 || col<0 || row>=n || col>=m || mat[row][col]==0 || visited[row][col]==true) 
            return ;
        visited[row][col]=true;
        longest(mat,n,m,row,col+1,desx,desy,length+1,visited);
        longest(mat,n,m,row+1,col,desx,desy,length+1,visited);
        longest(mat,n,m,row-1,col,desx,desy,length+1,visited);
        longest(mat,n,m,row,col-1,desx,desy,length+1,visited);
        visited[row][col]=false;
        return ;
    }
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        if(mat[xs][ys]==0) return -1;
        if(mat[xd][yd]==0) return -1;
        boolean visited[][]=new boolean[n][m];
        ans=Integer.MIN_VALUE;
        longest(mat,n,m,xs,ys,xd,yd,0,visited);
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}
        
