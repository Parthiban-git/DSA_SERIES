class Solution {
    
    int nextIndex(int index,int nums[],boolean isForward){
        boolean curr=nums[index]>0;
        if(isForward!=curr) return -1;
        int nextIndex=(index+nums[index])%nums.length;
        if(nextIndex<0){
            nextIndex=nextIndex+nums.length;
        }
        if(nextIndex==index) return -1;
        return nextIndex;
    }
    
    boolean cyclicCheck(int nums[]){
        for(int i=0;i<nums.length;i++){
            int slow=i,fast=i;
            boolean isForward=nums[i]>0;
            while(true){
                slow=nextIndex(slow,nums,isForward);
                if(slow==-1) break;
                fast=nextIndex(fast,nums,isForward);
                if(fast==-1) break;
                fast=nextIndex(fast,nums,isForward);
                if(fast==-1) break;
                if(slow==fast) return true;
            }
        }
        return false;
    }
    
    public boolean circularArrayLoop(int[] nums) {
        return cyclicCheck(nums);
    }
}