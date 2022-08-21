public:
    
    int dp[301][5001];
    
    int solve(int i, int amount, vector<int>& coins){
        
        if(i==0 || amount==0){
            return amount==0 ? 1:0;
        }
        if(i<0 || amount<0){
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        
        int inc = solve(i,amount-coins[i-1],coins) ;
        int nor = solve(i-1,amount,coins);
        
        return dp[i][amount] = inc+nor;
        
    }
    
    int change(int amount, vector<int>& coins) {
        memset(dp,-1,sizeof(dp));
        int n = coins.size();
        return solve(n,amount,coins);
    }
};