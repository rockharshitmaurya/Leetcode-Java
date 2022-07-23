class NumberContainers {
    HashMap<Integer,Integer> idx;
    HashMap<Integer,TreeSet<Integer>> value;
    public NumberContainers() {
        idx=new HashMap<>();
        value=new HashMap<>();
    }
    
    public void change(int index, int number) {
        idx.put(index,number);
        if(!value.containsKey(number)) value.put(number,new TreeSet<Integer>());
        value.get(number).add(index);
    }
    
    public int find(int number) {
       if(!value.containsKey(number)) return -1;
        for(Integer a:value.get(number)){
            if(idx.get(a)==number) return a;
        }
        return -1;
    }
    
    //for getting first element from the TreeSet as there is no direct method for this in java
    int getFirst(Set<Integer> set){
        for (int val : set) {
             return val;
        }
        return 0;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */