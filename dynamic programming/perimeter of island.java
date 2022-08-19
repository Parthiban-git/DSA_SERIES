class Solution {
    
    int perimeter(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return 1;
        if(grid[i][j]==0) return 1;
        // an island is surrounded by three sides water
        return 0;
    }
    
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int left=perimeter(grid,i,j-1);
                    int right=perimeter(grid,i,j+1);
                    int top=perimeter(grid,i-1,j);
                    int down=perimeter(grid,i+1,j);   
                    sum+=left+right+top+down;
                }
            }
        }
        return sum;
    }
}
