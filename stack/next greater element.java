import java.util.*;
public class Solution {	
    // just push the index 
	public static int[] nextGreater(int[] arr, int n){	                  
           int res[]=new int[arr.length];
           Stack<Integer> stack=new Stack<Integer>();
           for(int i=0;i<arr.length;i++){
               while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
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
