class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
            }
            else{
                nums[++i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).