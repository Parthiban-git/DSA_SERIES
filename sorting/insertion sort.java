class Solution {
    public int[] sortArray(int[] nums) {
         for(int i=1;i<nums.length;i++){
             int j=i-1;
             int temp=nums[i];
             while(j>=0 && temp<nums[j]){
                 nums[j+1]=nums[j];
                 j--;
             }
             nums[j+1]=temp;
         }
        return nums;
    }
}

// o(n) if the array is almost sorted
// Insertion sort has a fast best-case running time and is a good sorting algorithm to use
//  if the input list is already mostly sorted. For larger or more unordered lists, 
// an algorithm with a faster worst and average-case running time, such as mergesort, would be a better choice.