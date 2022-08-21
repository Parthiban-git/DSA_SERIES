class Solution
{
    public:
    //Function to return max value that can be put in knapsack of capacity W.
    int dp[1001][1001];
    int solve(int W, int wt[], int val[], int n){
        if(n<0 || W<0){
            return 0;
        }
        if(dp[n][W]!=-1) return dp[n][W];
        
        if(wt[n]<=W){
            return dp[n][W] = max(solve(W, wt, val, n-1), val[n]+solve(W-wt[n], wt, val, n-1));
        }
        else{
            return dp[n][W] = solve(W, wt, val, n-1);
        }
    }
    
    int knapSack(int W, int wt[], int val[], int n) 
    { 
        memset(dp, -1, sizeof(dp));
       return solve(W, wt, val, n-1);
    }
};