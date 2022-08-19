class Solution {
    
    void islands(char grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return ;
        }        
        if(grid[i][j]=='0') return ;
        grid[i][j]='0';
        islands(grid,i,j-1); //left
        islands(grid,i,j+1); //right
        islands(grid,i-1,j); //up
        islands(grid,i+1,j); //down
    }
    
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    islands(grid,i,j);
                }
            }
        }
        return count;
    }
}