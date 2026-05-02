class MinStack {
    Stack<Integer> st;
    Stack<Integer> temp;
    public MinStack() {
        st = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(temp.isEmpty() || val <= temp.peek()){
            temp.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int top = st.pop();
        if(top == temp.peek()){
            temp.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return temp.peek();
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