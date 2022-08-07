class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i:nums) set.add(i);
        for(int i:nums){
            int curr=i,prev=i-1;
            if(!set.contains(prev)){
                int count=0;
                while(set.contains(curr)){
                    count++;curr++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}