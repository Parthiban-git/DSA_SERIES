class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    }
}
// o(n) --> unsorted array solution xor
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

// (logn) for sorted array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==nums[mid^1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return nums[low];
    }
}

