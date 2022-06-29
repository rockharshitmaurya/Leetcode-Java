class CombinationIterator {
    int val=1,len,mask=0;
    Queue<String> q=new PriorityQueue<>();
    public CombinationIterator(String ch, int cl) {
        int n=ch.length();
        for(int i=0; i<(1<<n); i++){
            StringBuilder sb=new StringBuilder();
            if(Integer.bitCount(i)==cl){
                for(int j=0; j<n; j++){
                    if((i&(1<<j))>0) sb.append(ch.charAt(j));
                }
                q.add(sb+"");
            }
        }
        // Collections.sort(q);
        System.out.println(q);
    }
    
    public String next() {
       return q.poll();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */