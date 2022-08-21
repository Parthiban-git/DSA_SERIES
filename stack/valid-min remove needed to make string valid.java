
// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.


class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int balance=0;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ) balance++;
            else if(ch==')') balance--;
            if(balance<0){
                balance=0;
                continue;
            }
            stack.push(ch);
        }
        while(balance>0){
            if(stack.peek()=='('){
                stack.pop();
                balance--;
            }
            else sb.append(stack.pop());
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}