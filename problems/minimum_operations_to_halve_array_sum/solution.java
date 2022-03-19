class Solution {
    public int halveArray(int[] nums) {
       double sum=0,k=0;
        int ans=0;
        int count=0;
        PriorityQueue<Double> pq=new PriorityQueue<Double>(Collections.reverseOrder());
        for(int num:nums){
            pq.offer((double)num);
            sum+=num;
        }
        while(sum-k>sum/2){
            double pop=pq.poll();
            k+=pop/2;
            pq.offer(pop/2);
            ans++;
        }
        return ans;
    }
}