class Solution {
    public int[] sortArray(int[] nums) {
        // selection sort
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[min]>nums[j]) min=j;
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}
// selects the minimal element in right and swap with that o(n2) in worst and best case 
// When the array is NOT partially sorted. When we have memory usage constraints. 
// When a simple sorting implementation is desired. When the array to be sorted is relatively small.