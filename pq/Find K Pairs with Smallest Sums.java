class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> queue=new PriorityQueue<>((a,b)-> b.getKey()-a.getKey());
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum=nums1[i]+nums2[j];
                if(queue.size()<k){
                    queue.offer(new Pair<>(sum,new Pair<>(nums1[i],nums2[j])));
                }
                else if(sum<queue.peek().getKey()){
                    queue.poll();
                    queue.offer(new Pair<>(sum,new Pair<>(nums1[i],nums2[j])));
                }
                else{
                    break;
                }
            }
        }
        while(!queue.isEmpty()){
                Pair<Integer,Integer> pa=queue.poll().getValue();
                List<Integer> list=new ArrayList<>();
                int key=pa.getKey();
                int value=pa.getValue();
                list.add(key);
                list.add(value);
                res.add(list);
        }
        return res;
    }
}

