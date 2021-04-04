class MyCircularQueue {
    int arr[];
    int size,check=1;
    ArrayList<Integer> list=new ArrayList<>();
    public MyCircularQueue(int k) {
        arr=new int[1001];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(check>size) return false;
        arr[value]++;
        check++;
        list.add(value);
        return true;
    }
    
    public boolean deQueue() {
        if(list.size()==0) return false;
        arr[list.remove(0)]--;
        check--;
        return true;
    }
    
    public int Front() {
        if(list.size()==0) return -1;
        return list.get(0);
    }
    
    public int Rear() {
        if(list.size()==0) return -1;
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        return check==1;
    }
    
    public boolean isFull() {
        return check>size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */