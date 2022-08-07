class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
        // for inplace transpose matrix this is the answer if it is a square matrix
        int row=0;
        while(row<matrix.length){
            int start=0,end=matrix[0].length-1;
            while(start<=end){
                int temp=matrix[row][start];
                matrix[row][start]=matrix[row][end];
                matrix[row][end]=temp;
                start++;end--;
            }
            row++;
        }
    }
}
// input [[1,2,3],[4,5,6],[7,8,9]]
// o.p [[7,4,1],[8,5,2],[9,6,3]]

// transpose for non squared matrix

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int res[][]=new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
}

