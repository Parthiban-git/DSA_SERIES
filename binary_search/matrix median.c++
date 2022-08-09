
class Solution{   
public:
    
    int count(vector<int> &matrix,int target){
        int low=0,high=matrix.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    
    int median(vector<vector<int>> &matrix, int r, int c){
            int mi=INT_MAX,ma=INT_MIN;
            for(int i=0;i<matrix.size();i++){
                for(int j=0;j<matrix[0].size();j++){
                    mi=min(mi,matrix[i][j]);
                    ma=max(ma,matrix[i][j]);
                }
            }
            int low=mi,high=ma;
            while(low<=high){
                int mid=(low+high)/2;
                int n=0;
                for(int i=0;i<r;i++){
                    n+=count(matrix[i],mid);
                }
                if(n<(r*c+1)/2){
                    low=mid+1;
                }
                else high=mid-1;
            }
            return low;
    }
};
