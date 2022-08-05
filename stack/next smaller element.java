class Solution {
	public static int[] help_classmate(int arr[], int n) { 
	    Stack<Integer> stack=new Stack<>();
	    int res[]=new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
	            int index=stack.pop();
	            res[index]=arr[i];
	        }
	        stack.push(i);
	    }
	    while(!stack.isEmpty()){
	        res[stack.pop()]=-1;
	    }
	    return res;
	} 
}