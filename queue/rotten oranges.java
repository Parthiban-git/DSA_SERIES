class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    queue.offer(i*grid[0].length+j);
                }
            }
        }
        int diri[]={0,0,1,-1};
        int dirj[]={1,-1,0,0};
        //
        int rotten=0;
        while(!queue.isEmpty()){
            int k=queue.size();
            while(k>0){
                int index=queue.poll();
                int x=index/grid[0].length;
                int y=index%grid[0].length;
                for(int i=0;i<4;i++){
                    int nx=diri[i]+x;
                    int ny=dirj[i]+y;
                    if(nx<0 || ny<0 || nx>grid.length-1 || ny>grid[0].length-1) continue;
                    if(grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        queue.offer(nx*grid[0].length+ny);
                    }
                }
                k--;
            }
            if(!queue.isEmpty()) rotten++;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return rotten;
    }
}

