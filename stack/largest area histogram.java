class Solution {
    public int largestRectangleArea(int[] heights) {
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=0;i<heights.length;i++){
            int dummy=0;
            while(!stack.isEmpty()){
                int val=stack.peek();
                if(heights[i]<=heights[val]){
                    stack.pop();
                }
                else{
                    dummy=stack.peek()+1;
                    break;
                }
            }
            left[i]=dummy;
            stack.push(i);
        }
        stack.clear();
        for(int i=heights.length-1;i>=0;i--){
            int dummy=heights.length-1;
            while(!(stack.isEmpty())){
                int val=stack.peek();
                if(heights[val]>=heights[i]){
                    stack.pop();
                }
                else{
                    dummy=stack.peek()-1;
                    break;
                }
            }
            right[i]=dummy;
            stack.push(i);
        }
        
        int maxarea=Integer.MIN_VALUE;
        for(int k=0;k<heights.length;k++){
            if((right[k]-left[k]+1)*heights[k]>maxarea){
                maxarea=(right[k]-left[k]+1)*heights[k];
            }
        }
        return maxarea;
    }
}


