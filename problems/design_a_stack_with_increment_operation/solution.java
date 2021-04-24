class CustomStack {
    List<Integer> list=new ArrayList<>();
    int size;
    public CustomStack(int maxSize) {
        size=maxSize;
    }
    
    public void push(int x) {
        if(list.size()<size)
            list.add(x);
    }
    
    public int pop() {
        if(list.size()==0) return -1;
        else return list.remove(list.size()-1);
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<(k>=list.size()?list.size():k); i++){
            list.set(i,list.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */