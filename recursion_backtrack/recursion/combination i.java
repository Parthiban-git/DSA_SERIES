class Solution {
    public:
        
        vector<vector<int>> res;
        void recur(vector<int>& nums,int target,vector<int> &list,int index){
            if(target==0){
                res.push_back(list);
                return ;
            }
            else if(target<0 || index==nums.size()) return ;
            list.push_back(nums[index]);
            recur(nums,target-nums[index],list,index);
            list.pop_back();
            recur(nums,target,list,index+1);
        }
        
        
        vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
            vector<int> list;
            recur(candidates,target,list,0);
            return res;
        }
    };

//     Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
