// best o(nliogn) worst o(n2)

//pseudo code 
class Solution{
    int partition(int nums[],int lower,int upper){
        int pivot=nums[lower];
        int start=lower,end=upper;
        while(start<end){
            while(nums[start]<=pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<end){
                swap(nums[start],nums[end]);
            }
        }
        swap(nums[lower],nums[end]);
        return end;
    }
    void quicksort(int nums[],int lower,int upper){
          if(lower<upper){
            int loc=partition(nums,lower,upper);
            quicksort(nums,lower,loc-1);
            quicksort(nums,loc,upper);
          }
    }
}