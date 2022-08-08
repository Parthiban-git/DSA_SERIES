class Solution {
    public int[] findDiagonalOrder(int[][] mat){
        int res[]=new int[mat.length*mat[0].length],count=1,index=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int k=0;k<mat.length;k++){
            int i=k;
            int j=0;
            while(i>=0){
                try{
                    list.add(mat[i][j]);
                }
                catch(Exception e){
                    break;
                }
                i=i-1;
                j=j+1;
            }
            if(++count%2!=0){
                Collections.reverse(list);
            }
            for(int z:list){
                res[index++]=z;
            }
            list.clear();
        }
        
        for(int k=1;k<mat[0].length;k++){
            int i=mat.length-1;
            int j=k;
            while(j<=mat[0].length-1){
                try{
                    list.add(mat[i][j]);
                }
                catch(Exception e){
                    break;
                }
                i=i-1;
                j=j+1;
            }
             if(++count%2!=0){
                Collections.reverse(list);
            }
            for(int z:list){
                res[index++]=z;
            }
            list.clear();
        }
        return res;        
    }
}