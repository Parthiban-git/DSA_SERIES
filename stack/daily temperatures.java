class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int idx=stack.pop();
                ans[idx]=i-idx;
            }
            stack.push(i);
        }
        return ans;
    }
}
// qn  [73,74,75,71,69,72,76,73]
// ans [1,1,4,2,1,1,0,0]