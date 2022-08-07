// log(n) soln
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length==0){
             return false;
         }
         int n=matrix.length,m=matrix[0].length;
        int low=0,high=(n*m)-1;
        int div=matrix[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target>matrix[mid/div][mid%div]){
                low=mid+1;
            }
            else if(target<matrix[mid/div][mid%div]){
                high=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}