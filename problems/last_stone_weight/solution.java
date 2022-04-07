class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1,o2)->(o2-o1));
        for(int num:stones) pq.offer(num);
        while(pq.size()>1){
           // System.out.println(pq);
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b) pq.offer(Math.abs(a-b));
        }

        return pq.size()==0?0:pq.peek();
    }
}