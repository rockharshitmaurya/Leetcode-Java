class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int num:nums) pq.offer((long)num);
        while(k-->0){
            long num=pq.poll();
            num++;
            pq.offer(num);
            
        }
        long pro=1;
        while(!pq.isEmpty()){
            pro=(pro*pq.poll())%1000000007;
        }
        return (int)pro;
    }
}