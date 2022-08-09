class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int val=(int)map.getOrDefault(i,0)+1;
            map.put(i,val);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry entry:map.entrySet()){
            queue.offer((int)entry.getKey());
        }
        int res[]=new int[k];
        int index=0;
        for(int i=0;i<k;i++){
            res[index++]=queue.poll();
        }
        return res;
    }
}