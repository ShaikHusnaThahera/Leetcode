class MinStack {
    Stack<Integer> hr;
    Stack<Integer> m;
    int min;
    public MinStack() {
        hr=new Stack<>();
        m=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    public void push(int value) {
        hr.push(value);
        if(m.isEmpty()){
            m.push(value);
            min=value;
        }
        else{
        min=Math.min(value,m.peek());
        m.push(min);
        }
    }
    public void pop() {
        if(hr.isEmpty()){
            return;
        }
        hr.pop();
        m.pop();
    }
    public int top() {
        if(hr.isEmpty()){
            return 0;
        }
        int top=hr.peek();
        return top;
    }
    public int getMin() {
        return m.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */