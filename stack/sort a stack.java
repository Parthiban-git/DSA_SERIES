import java.util.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		Stack<Integer> dup=new Stack<>();
        while(!stack.isEmpty()){
            int curr=stack.pop();
            while(!dup.isEmpty() && dup.peek()<curr){ 
                stack.push(dup.pop());
            }
            dup.push(curr);
        }
        // dup consists in descending order
        while(!stack.isEmpty()) stack.pop();
        while(!dup.isEmpty()) stack.push(dup.pop());  // now stack in ascending order
	}

}
// sort in ascending order 