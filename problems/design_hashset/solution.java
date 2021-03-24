class MyHashSet {

    /** Initialize your data structure here. */
//     int set[];
//     public MyHashSet() {
//        set=new int[10000001]; 
//     }
    
//     public void add(int key) {
//         if(set[key]==0) set[key]++;
        
//     }
    
//     public void remove(int key) {
//        if(set[key]>0) set[key]--;
//     }
    
//     /** Returns true if this set contains the specified element */
//     public boolean contains(int key) {
//         return set[key]>0;
//     }
    boolean[] hashSet;
    /** Initialize your data structure here. */
    public MyHashSet() {
         hashSet = new boolean[1000001];
    }
    
    public void add(int key) {
        hashSet[key] = true;
    }
    
    public void remove(int key) {
        hashSet[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hashSet[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */