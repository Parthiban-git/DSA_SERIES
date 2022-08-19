class Solution {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    void allpermutations(int nums[],int ind){
        if(ind==nums.length){
            List<Integer> list=new ArrayList<Integer>();
            for(int i:nums){
                list.add(i);
            }
            res.add(new ArrayList<Integer>(list));
            return ;
        }
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            allpermutations(nums,ind+1);
            swap(ind,i,nums);
        }
    }
    
    void swap(int i,int ind,int nums[]){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        allpermutations(nums,0);
        return res;
    }
}