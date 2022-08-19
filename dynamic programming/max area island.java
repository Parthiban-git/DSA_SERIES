class Solution {
    int maxarea(int grid[][],int i,int j,int area){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return area;
        grid[i][j]=0;
        area++;
        area=maxarea(grid,i,j-1,area); //left
        area=maxarea(grid,i,j+1,area); //right
        area=maxarea(grid,i-1,j,area); //up
        area=maxarea(grid,i+1,j,area); //down
        return area;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){  
                    int area=maxarea(grid,i,j,0);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
}