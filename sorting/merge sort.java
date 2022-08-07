class Solution {
    void merge(int nums[],int lower,int mid,int upper){
        int n1=mid-lower+1;
        int n2=upper-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=nums[i+lower];
        }
        for(int i=0;i<n2;i++){
            R[i]=nums[i+mid+1];
        }
        int i=0,j=0,k=lower;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                nums[k]=L[i++];
            }
            else{
                nums[k]=R[j++];
            }
            k++;
        }
        while(i<n1){
            nums[k++]=L[i++];
        }
        while(j<n2){
            nums[k++]=R[j++];
        }
    }
    
    void mergetree(int nums[],int lower,int upper){
        if(lower>=upper){
            return ;
        }
        int mid=(lower+upper)/2;
        mergetree(nums,lower,mid);
        mergetree(nums,mid+1,upper);
        merge(nums,lower,mid,upper);
    }
    public int[] sortArray(int[] nums) {
        mergetree(nums,0,nums.length-1);
        return nums;
    }
}