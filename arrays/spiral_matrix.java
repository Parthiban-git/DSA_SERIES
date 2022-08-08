class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int k=0,l=0,last_row=matrix.length-1,last_col=matrix[0].length-1;
        while(k<=last_row && l<=last_col){
            for(int i=k;i<=last_col;i++){
                res.add(matrix[k][i]);
            }
            k++;
            for(int i=k;i<=last_row;i++){
                res.add(matrix[i][last_col]);
            }
            last_col--;
            if(k<=last_row){
                for(int i=last_col;i>=l;i--){
                    res.add(matrix[last_row][i]);
                }
                last_row--;
            }
            if(l<=last_col){
                for(int i=last_row;i>=k;i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}