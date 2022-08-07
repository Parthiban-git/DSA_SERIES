class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int tar=target-nums[i];
            if(!map.containsKey(tar)){
                map.put(nums[i],i);
            }
            else{
                res[0]=map.get(tar);
                res[1]=i;
                break;
            }
        }
        return res;
    }
}