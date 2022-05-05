class MyStack {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> st=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        while(q.size()>1) st.offer(q.poll());
        int ans=q.poll();
        while(!st.isEmpty()) q.offer(st.poll());
        // st=new LinkedList<>();
        return ans;
    }
    
    public int top() {
        
        while(q.size()>1) st.offer(q.poll());
        int ans=q.poll();
        while(!st.isEmpty()) q.offer(st.poll());
        // st=new LinkedList<>();
        q.offer(ans);
        return ans;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */