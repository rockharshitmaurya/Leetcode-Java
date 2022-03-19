class Pair{
    int val;
    int count;
    int seq=0;
    public Pair(int _val,int _count,int _seq){
        val=_val;
        count=_count;
        seq=_seq;
    }
}
class FreqStack {
    PriorityQueue<Pair> pq;
    HashMap<Integer,Integer> map;
    int seq;
    public FreqStack() {
        pq=new PriorityQueue<Pair>(new Comparator<Pair>(){
        public int compare(Pair o1, Pair o2) {
        if (o1.count != o2.count) return o2.count - o1.count;
        else return o2.seq - o1.seq;
        }
        });
        map=new HashMap<>();
        seq=0;
    }
    
    public void push(int val) {
        seq++;
        map.put(val,map.getOrDefault(val,0)+1);
        pq.offer(new Pair(val,map.get(val),seq));
    }
    
    public int pop() {
      // for(Pair p:pq) System.out.print(p.val+" "+p.count+" "+p.seq+" --> ");
      //     System.out.println();
        int num=pq.poll().val;
        if(map.get(num)>1){
            map.put(num,map.get(num)-1);
        }else{
            map.remove(num);
        }
        return num;  
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */