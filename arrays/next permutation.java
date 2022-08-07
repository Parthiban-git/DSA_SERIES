class Solution {
    void reverse(int i,int j,int nums[]){
        while(i<j){
            int temp=nums[j];
            nums[j--]=nums[i];
            nums[i++]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return ;
        int i=0;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                break;
            }
        }
        if(i>=0){
            int j=0;
            for(j=nums.length-1;j>=0;j--){
                if(nums[j]>nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(i+1,nums.length-1,nums);
            
        }
        else{
            reverse(0,nums.length-1,nums);
        }
    }
}

/// 1 3 5 4 2
// to get the next permutation, 2->4->5 inc order and 5 3 is in misorder

// so 3 can be swapped with 4, or 5 but to get next permutation, is is swapped with 4
// reason for reversing is, after swapped it becomes 1 4 5 3 2
// next after 4 we want the permutaion from beginning so, revesing gives  the minimal value