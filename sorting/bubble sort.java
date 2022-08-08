class Solution {
    public int[] sortArray(int[] nums) {
        //bubble sort
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false) break;
        }
        return nums;
    }
}
// Advantages of using bubble sort
// Bubble sort's strong point is its simplicity. 
// It takes just a few lines of code, is easy to read, and can be plugged in anywhere in your program. However, 
// it's extremely inefficient for larger sets of numbers and should be used accordingly. 