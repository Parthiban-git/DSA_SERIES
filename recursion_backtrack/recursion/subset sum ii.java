void recur(int ind,vector<vector<int>> &res,vector<int> &list,vector<int> &nums){
    res.push_back(list);
    for(int i=ind;i<nums.size();i++){
        if(i!=ind && nums[i]==nums[i-1]) continue;
        list.push_back(nums[i]);
        recur(i+1,res,list,nums);
        list.pop_back();
    }
}

vector<vector<int>> subsetsWithDup(vector<int>& nums) {
    vector<vector<int>> res;
    vector<int> ans;
    sort(nums.begin(),nums.end());
    recur(0,res,ans,nums);
    return res;
}