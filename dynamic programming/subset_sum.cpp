public:
    int dp[101][10001];
    bool solve(vector<int> arr,int sum,int index){
        if(sum==0) return true;
        if(index>=arr.size() || sum<0){
            return false;
        }
        if(dp[index][sum]!=-1) return dp[index][sum];
        //inc
        bool inc;
        if(sum>=arr[index]){
            inc = solve(arr, sum-arr[index], index+1) || solve(arr, sum, index+1);
        }
        bool not_inc = solve(arr, sum, index+1);
        return dp[index][sum] = inc || not_inc;
    }

    bool isSubsetSum(vector<int>arr, int sum){
        memset(dp, -1, sizeof(dp));
        return solve(arr,sum,0);
    }
};