int dp[12][10000];
    int solve(vector<int> coins, int ind, int amount){
        if(amount==0) return 0;
        if(amount<0 || ind==coins.size()) return 10000;
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int inc=1+solve(coins,ind,amount-coins[ind]);
        int not_inc=solve(coins,ind+1,amount);
        return dp[ind][amount]=min(inc,not_inc);
    }
    
    int coinChange(vector<int>& coins, int amount) {
        memset(dp, -1, sizeof(dp));
        int ans = solve(coins, 0, amount);
        if(ans>=10000){
            return -1;
        }
        return ans;
    }