// space o(2n)
class Pair{
    int key,value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}

class MinStack {
    Stack<Pair> stack=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(!stack.isEmpty()){
            Pair obj=stack.peek();
            stack.push(new Pair(val,Math.min(obj.value,val)));
        }
        else{
            stack.push(new Pair(val,val));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()) stack.pop();
    }
    
    public int top() {
        return stack.peek().key;
    }
    
    public int getMin() {
        return stack.peek().value;
    }
}


/// o(n) space without key value

class MinStack {
    Stack < Long > st = new Stack < Long > ();
    Long mini;

    /** initialize your data structure here. */
    public MinStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}
