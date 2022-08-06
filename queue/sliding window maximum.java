class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!queue.isEmpty() && nums[i]>queue.getLast()){
                queue.pollLast();
            }
            queue.offerLast(nums[i]);
        }
        int res[]=new int[(nums.length-k)+1];
        int index=0;
        res[index++]=queue.peek();
        for(int i=k;i<nums.length;i++){
            if(nums[i-k]==queue.peek()){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[i]>queue.getLast()){
                queue.pollLast();
            }
            queue.offerLast(nums[i]);
            res[index++]=queue.peek();
        }
        return res;
    }
    
}