// [100,80,60,70,60,75,85]
// [1,1,1,2,1,4,6]

class Solution{
    int[] span(){
        Stack<Integer> stack=new Stack<>();
        int index=0;
        span[0]=1;
        stack.push(price[0]);
        for(int i=1;i<prices.length;i++){
            while(!stack.isEmpty() && prices[i]<stack.peek()) {
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-stack.peek();
            }
            stack.push(prices[i]);
        }
        return span;
    }
}