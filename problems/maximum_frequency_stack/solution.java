class FreqStack {
    private HashMap<Integer,Integer> freq;
    private HashMap<Integer,Stack<Integer>> group;
    int maxfreq;
    public FreqStack() {
      freq=new HashMap<>();
        group=new HashMap<>();
        maxfreq=0;
    }
   
    public void push(int x) {
    int f=freq.getOrDefault(x,0)+1;
        freq.put(x,f);
        if(f>maxfreq)
            maxfreq=f;
        Stack<Integer> st=group.getOrDefault(f,new Stack<Integer>());
        st.push(x);
        group.put(f,st);
    }
    
    public int pop() {
      int x=group.get(maxfreq).pop();
        freq.put(x,freq.get(x)-1);
        if(group.get(maxfreq).size()==0){
            group.remove(maxfreq);
            maxfreq--;
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */