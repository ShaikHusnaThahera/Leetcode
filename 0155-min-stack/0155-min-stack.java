class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        long val=value;
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }
        else{
            if(val>min){
                st.push(val);
            }
            else{
                st.push(2*val-(int)min);
                min=val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
    long n=st.peek();
        st.pop();
        if(n<min){
            min=2*(int)min-n;
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
       long n=st.peek();
        if(n<min){
            return (int)min;
        }
        return (int)n;
    }
    
    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */