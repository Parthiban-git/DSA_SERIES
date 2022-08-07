class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums.length==0){
            return res;
        }
        int n=nums.length;
        Arrays.sort(nums);
        //code starts
        
        for(int i=0;i<n-2;i++){
            int b=i+1,c=n-1;
            while(b<c){
                int sum=nums[b]+nums[c];
                int target=-(nums[i]);
                if(sum<target){
                    b++;
                }
                else if(sum>target){
                    c--;
                }
                else{
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[b]);
                    list.add(nums[c]);
                    res.add(list);
                    while(b<c && nums[b]==list.get(1)) b++;
                    while(b<c && nums[c]==list.get(2)) c--;
                }
            }
            while(nums[i]==nums[i+1] && i<n-2)i++;
        }
        return res;
    }
}