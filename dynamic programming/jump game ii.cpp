class Solution {
public:
    
    int dp[10001];
    int minjump(vector<int>& nums,int index){
        if(index>=nums.size()-1){
            return 0;
        }
        if(dp[index]!=-1) return dp[index];
        int mini=1e9;
        for(int i=1;i<=nums[index];i++){
            mini=min(mini,1+minjump(nums,index+i));
        }
        return dp[index]=mini;
    }
    
    int jump(vector<int>& nums) {
        memset(dp,-1,sizeof(dp));
        return minjump(nums,0);
    }
};
// Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

// Each element in the array represents your maximum jump length at that position.

// Your goal is to reach the last index in the minimum number of jumps.

// You can assume that you can always reach the last index.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.