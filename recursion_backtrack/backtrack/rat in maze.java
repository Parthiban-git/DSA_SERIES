class Solution {
    static void longest(int mat[][],int n,int m,int row,int col,String move,boolean visited[][]
    ,ArrayList<String> list){
        if(row==n-1 && col==m-1){
            list.add(move);
            return ;
        }
        if(row<0 || col<0 || row>=n || col>=m || mat[row][col]==0 || visited[row][col]==true) 
            return ;
        visited[row][col]=true;
        longest(mat,n,m,row,col+1,move+'R',visited,list);
        longest(mat,n,m,row+1,col,move+'D',visited,list);
        longest(mat,n,m,row-1,col,move+'U',visited,list);
        longest(mat,n,m,row,col-1,move+'L',visited,list);
        visited[row][col]=false;
        return ;
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList < String > ans = new ArrayList < > ();
        if(m[n-1][n-1]==0 || m[0][0]==0){
            ans.add(Integer.toString(-1));
            return ans;
        }
        boolean visited[][]=new boolean[n][n];
        longest(m,n,n,0,0,"",visited,ans);
        return ans;
    }
}