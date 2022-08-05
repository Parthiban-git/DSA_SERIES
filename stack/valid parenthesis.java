class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(!stack.isEmpty()){
                    if(c==')' && stack.peek()=='('){
                        stack.pop();
                    }
                    else if(c=='}' && stack.peek()=='{'){
                        stack.pop();
                    }
                    else if(c==']' && stack.peek()=='['){
                        stack.pop();
                    }  
                    else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}