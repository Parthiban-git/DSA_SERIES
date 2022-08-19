class Solution {
    public int maxProduct(int[] nums) {
        int prod1=1,prod2=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prod1*=nums[i];
            ans=Math.max(ans,prod1);            
            if(prod1==0){
                prod1=1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            prod2*=nums[i];
            ans=Math.max(ans,prod2);            
            if(prod2==0){
                prod2=1;
            }
        }
        return ans;
    }
}

// Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// A subarray is a contiguous subsequence of the array.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.