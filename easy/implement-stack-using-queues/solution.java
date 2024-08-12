class MyStack {

    static Queue<Integer> q1, q2;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q2.add(x);

        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q2;
        q2=q1;
        q1=q;
    }
    
    public int pop() {
        int a = q1.peek();
        q1.remove();
        return a;
    }
    
    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();    
    }
    
    public boolean empty() {

        return q1.isEmpty();
        
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