class MyHashSet {
    int arr[];
    public MyHashSet() {
        arr=new int[10000001];
        Arrays.fill(arr,-1);
    }
    
    public void add(int key) {
        arr[key]=1;
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
    
    public boolean contains(int key) {
        // System.out.println(Arrays.toString(arr));
        return arr[key]!=-1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */